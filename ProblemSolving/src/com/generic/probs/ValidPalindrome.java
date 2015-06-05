package com.generic.probs;

/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.*/

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
        
        if(s != null){
            String sNoSpace = removeSpaces(s);
            
            if(sNoSpace.isEmpty()) {
                return true;
            }
  
            String sAlphanumric = convertToAlphaNumric(sNoSpace);
            String rev = new StringBuilder(sAlphanumric).reverse().toString();
            
            if(sAlphanumric.equalsIgnoreCase(rev)) {
                return true;
            }
        }
        return false;
    }
    
    public String removeSpaces(String s) {
       StringBuilder sb = new StringBuilder(s.toString().replaceAll("\\s+", ""));
       return sb.toString();
    }
    
    public String convertToAlphaNumric(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           if(Character.isLetterOrDigit(c)) {
               sb = sb.append(c);
           }
            else {
                continue;
            }
        }
        return sb.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a.";
		ValidPalindrome p = new ValidPalindrome();
		boolean result = p.isPalindrome(s);
		
		System.out.println("Result: " + result);
		
	}

}
