package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateExerciseTest {
    @Test
    void checkNumber_whenZero_shouldReturnBoth() {
        assertEquals("#$0", IntermediateExercise.checkNumber(0));
    }

    @Test
    void checkNumber_whenOne_shouldReturnNone() {
        assertEquals("1", IntermediateExercise.checkNumber(1));
    }

    @Test
    void checkNumber_whenThree_shouldReturnHashtag() {
        assertEquals("#3", IntermediateExercise.checkNumber(3));
    }

    @Test
    void checkNumber_whenFive_shouldReturnDollar() {
        assertEquals("$5", IntermediateExercise.checkNumber(5));
    }

    @Test
    void checkHundredNumbers_shouldReturnCorrectNumbers() {
        String expectedHundredNumbers = "1 2 #3 4 $5 #6 7 8 #9 $10 11 #12 13 14 #$15 16 17 #18 19 $20 #21 22 23 #24 $25 26 #27 28 29 #$30 31 32 #33 34 $35 #36 37 38 #39 $40 41 #42 43 44 #$45 46 47 #48 49 $50 #51 52 53 #54 $55 56 #57 58 59 #$60 61 62 #63 64 $65 #66 67 68 #69 $70 71 #72 73 74 #$75 76 77 #78 79 $80 #81 82 83 #84 $85 86 #87 88 89 #$90 91 92 #93 94 $95 #96 97 98 #99 $100 ";
        assertEquals(expectedHundredNumbers, IntermediateExercise.checkHundredNumbers());
    }
}