package com.sparta.fk;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class PalindromeTestTest {

    @Test
    @DisplayName("Check checkWord method for true")
    public void checkCheckWordMethodPalindrome() {
        Assertions.assertEquals(true, App.checkWord("level"));
    }

    @Test
    @DisplayName("Check checkWord method for false")
    public void checkCheckWordMethodNotPalindrome() {
        Assertions.assertEquals(false, App.checkWord("snack"));
    }

    @Test
    @DisplayName("Check checkWordWithBuilder method for false")
    public void checkCheckWithBuilderMethodPalindrome() {
        Assertions.assertEquals(true, App.checkWordWithBuilder("level"));
    }

    @Test
    @DisplayName("Check checkWordWithBuilder method for false")
    public void checkCheckWithBuilderMethodNotPalindrome() {
        Assertions.assertEquals(false, App.checkWordWithBuilder("snack"));
    }

    @Test
    @DisplayName("Check checkword method for false")
    public void checkLongestPalindromePalindrome() {
        String[] sentence = {"This", "is", "level"};
        Assertions.assertEquals("level", PalindromeTest.findLongestPalindrome(sentence));
    }

    @Test
    @DisplayName("Check checkword method for false")
    public void checkLongestPalindromeNoPalindrome() {
        String[] sentence = {"This", "is", "a", "sentence"};
        Assertions.assertEquals("No Palindrome found", PalindromeTest.findLongestPalindrome(sentence));
    }




}
