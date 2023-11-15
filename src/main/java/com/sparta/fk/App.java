package com.sparta.fk;



public class App {

    public static boolean checkWord(String word){

        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }

    }
        return true;
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

        String toTest = "snack";
        System.out.println(checkWord(toTest));
        String wordToTest = "level";
        System.out.println(checkWordWithBuilder(wordToTest));



    }
}
