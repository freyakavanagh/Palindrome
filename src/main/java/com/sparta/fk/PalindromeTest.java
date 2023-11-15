package com.sparta.fk;

public class PalindromeTest {

    public static String findLongestPalindrome(String[] strings) {
        String longestPalindrome = " ";

        for (String str : strings) {
            if (checkWordWithBuilder(str) && str.length() > longestPalindrome.length()) {
                longestPalindrome = str;
            }
        }
        if(longestPalindrome == " ") {
            String noPal = "No Palindrome found";
            return noPal;
        }

        return longestPalindrome;
    }

    public static boolean checkWordWithBuilder(String word){

        StringBuilder newWord = new StringBuilder();
        newWord.append(word).reverse();
        if(newWord.toString().equals(word)){
            return true;
        }
        return false;
    }

    public static void main( String[] args )
    {

        String[] sentence = {"This", "is", "a", "sentence"};
        System.out.println(findLongestPalindrome(sentence));
    }
}
