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

    /*public static String findLongestWord(String[] words) {

        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        String[] newArray = removeStringFromArray(originalArray, stringToDelete);

        return longestWord;
    }

    public static String checkWord(String[] sentence){

        String longestWord = findLongestWord(sentence);



        StringBuilder newWord = new StringBuilder();
        newWord.append(longestWord).reverse();

        if(longestWord.equals(newWord.toString())){

            return longestWord;
        }else{


        }

        return longestWord;
    }*/



    public static void main( String[] args )
    {

        String toTest = "snack";
        System.out.println(checkWord(toTest));
        String wordToTest = "level";
        System.out.println(checkWordWithBuilder(wordToTest));
        //String[] sentence = {"This", "is", "a", "sentence"};


    }
}
