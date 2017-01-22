package com.foxminded.uniqcharnumbers.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ResultFinderTest {
    private ResultFinder tester;

    @Before
    public void setUp() throws Exception {
        tester = new ResultFinder();
    }

    @After
    public void tearDown() throws Exception {
        tester = null;
    }

    // Tests for the method findUniqueStringsCharacters(String str)
    @Test
    public void testFindUniqueStringsCharacters() {
        String testee = new String("hello World!");
        char prospect[] = new char[]{'d', 'W', ' ', '!', 'e', 'r', 'o', 'l', 'h'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work correctly at all",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfSymbolsOnly() {
        String testee = new String("helloworld");
        char prospect[] = new char[]{'w', 'd', 'e', 'r', 'o', 'l', 'h'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of symbols only",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfSignsOnly() {
        String testee = new String("`!@#$%^&*()-_=+");
        char prospect[] = new char[]{'#', '!', '@', '&', '`', '$', '%', '*', '+', '(', ')', '-', '_', '^', '='};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of signs only",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfDigitsOnly() {
        String testee = new String("012345678910");
        char prospect[] = new char[]{'3', '2', '1', '0', '7', '6', '5', '4', '9', '8'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of digits only",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentIsEmpty() {
        String testee = new String("");
        char prospect[] = new char[]{};
        assertArrayEquals("findUniqueStringsCharacters doesn't return empty array if argument is empty",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentHasOneEmptyCharacter() {
        String testee = new String(" ");
        char prospect[] = new char[]{' '};
        assertArrayEquals("findUniqueStringsCharacters doesn't return array with one character ' ' if"
                        + " argument has one empty character",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfDigitsSymbolsSigns() {
        String testee = new String("a4 45b a-8");
        char prospect[] = new char[]{' ', 'b', '5', '4', 'a', '8', '-' };
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of digits, symbols and signs",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfDigitsAndSymbols() {
        String testee = new String("df678kgf45a786h8g");
        char prospect[] = new char[]{'f', 'g', 'd', '7', '6', '5', 'a', '4', '8', 'k', 'h'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of digits and symbols",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfDigitsAndSigns() {
        String testee = new String("56-67!86=46`'678");
        char prospect[] = new char[]{'!', '7', '\'', '6', '`', '5', '4', '8', '=', '-'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of digits and signs",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfSymbolsAndDigits() {
        String testee = new String("as45fg67sa45gf890");
        char prospect[] = new char[]{'f', 'g', '0', '7', 's', '6', '5', '4', 'a', '9', '8'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of symbols and digits",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    @Test
    public void testFindUniqueStringsCharactersIfArgumentConsistsOfSymbolsAndSigns() {
        String testee = new String("-as~~g!~ sa@!gf$%#!");
        char prospect[] = new char[]{'f', '#', 'g', ' ', '!', '@', 's', '$', '%', 'a', '~', '-'};
        assertArrayEquals("findUniqueStringsCharacters doesn't work coorectly if argument "
                        + "consists of symbols and signs",
                prospect, tester.findUniqueStringsCharacters(testee));
    }

    // Tests for the method findNumbersOfEachCharacter(String str)
    @Test
    public void testFindNumbersOfEachCharacter() {
        String testee = new String("hello World!");
        char forTest[] = new char[]{'d', 'W', ' ', '!', 'e', 'r', 'o', 'l', 'h'};
        int prospect[] = new int[]{1, 1, 1, 1, 1, 1, 2, 3, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work correctly at all",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfSymbolsOnly() {
        String testee = new String("helloworld");
        char forTest[] = new char[]{'w', 'd', 'e', 'r', 'o', 'l', 'h'};
        int prospect[] = new int[]{1, 1, 1, 1, 2, 3, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of symbols only",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfSignsOnly() {
        String testee = new String("`!@#$%^&*()-_=+");
        char forTest[] = new char[]{'#', '!', '@', '&', '`', '$', '%', '*', '+', '(', ')', '-', '_', '^', '='};
        int prospect[] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of signs only",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfDigitsOnly() {
        String testee = new String("012345678910");
        char forTest[] = new char[]{'3', '2', '1', '0', '7', '6', '5', '4', '9', '8'};
        int prospect[] = new int[]{1, 1, 2, 2, 1, 1, 1, 1, 1, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of digits only",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentIsEmpty() {
        String testee = new String("");
        char forTest[] = new char[]{};
        int prospect[] = new int[]{};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't return empty array if argument is empty",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentHasOneEmptyCharacter() {
        String testee = new String(" ");
        char forTest[] = new char[]{' '};
        int prospect[] = new int[]{1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't return array with 1 if"
                        + " argument has one empty character",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfDigitsSymbolsSigns() {
        String testee = new String("a4 45b a-8");
        char forTest[] = new char[]{' ', 'b', '5', '4', 'a', '8', '-' };
        int prospect[] = new int[]{2, 1, 1, 2, 2, 1, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of digits, symbols and signs",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfDigitsAndSymbols() {
        String testee = new String("df678kgf45a786h8g");
        char forTest[] = new char[]{'f', 'g', 'd', '7', '6', '5', 'a', '4', '8', 'k', 'h'};
        int prospect[] = new int[]{2, 2, 1, 2, 2, 1, 1, 1, 3, 1, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of digits and symbols",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfDigitsAndSigns() {
        String testee = new String("56-67!86=46`'678");
        char forTest[] = new char[]{'!', '7', '\'', '6', '`', '5', '4', '8', '=', '-'};
        int prospect[] = new int[]{1, 2, 1, 5, 1, 1, 1, 2, 1, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of digits and signs",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfSymbolsAndDigits() {
        String testee = new String("as45fg67sa45gf890");
        char forTest[] = new char[]{'f', 'g', '0', '7', 's', '6', '5', '4', 'a', '9', '8'};
        int prospect[] = new int[]{2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of symbols and digits",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

    @Test
    public void testFindNumbersOfEachCharacterIfArgumentConsistsOfSymbolsAndSigns() {
        String testee = new String("-as~~g!~ sa@!gf$%#!");
        char forTest[] = new char[]{'f', '#', 'g', ' ', '!', '@', 's', '$', '%', 'a', '~', '-'};
        int prospect[] = new int[]{1, 1, 2, 1, 3, 1, 2, 1, 1, 2, 3, 1};
        assertArrayEquals("findNumbersOfEachCharacter(String str) doesn't work coorectly if argument "
                        + "consists of symbols and signs",
                prospect, tester.findNumbersOfEachCharacter(testee, forTest));
    }

}
