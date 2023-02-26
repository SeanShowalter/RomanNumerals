package main.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;
//import RomanNumerals;

class RomanNumeralsTest {
    // This test will see if the constructor can be created with a String
    @Test
    public void constructor_is_string() {
        // Arrange: set up the required objects
        String expected = "XIV";
        RomanNumerals rn = new RomanNumerals(expected);
        String actual = rn.romanNumerals;
        assertEquals(expected, actual);
    }

    @Test
    public void constructor_is_integer() {
        // Arrange:
        Integer expected = 2500;
        RomanNumerals rn = new RomanNumerals(expected);
        Integer actual = rn.arabicNumerals;
        assertEquals(expected.intValue(),actual.intValue());
    }

    @Test
    public void convert_romanNumeral_15() {
        // Arrange:
        String romanNumeral = "XV";
        main.java.RomanNumerals rn = new main.java.RomanNumerals(romanNumeral);
        Integer expected = 15;
        Integer actual = rn.arabicNumerals;

        // Assert
        assertEquals(expected, actual);
    }

    @Test
        public void convert_romanNumeral_3500() {
            // Arrange:
            String romanNumeral = "MMMD";
            main.java.RomanNumerals rn = new main.java.RomanNumerals(romanNumeral);
            Integer expected = 3500;
            Integer actual = rn.arabicNumerals;

            // Assert
            assertEquals(expected, actual);
    }

    @Test
    public void convert_romanNumeral_2753() {
        // Arrange:
        String romanNumeral = "MMDCCLIII";
        main.java.RomanNumerals rn = new main.java.RomanNumerals(romanNumeral);
        Integer expected = 2753;
        Integer actual = rn.arabicNumerals;

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void convert_romanNumeral_1() {
        // Arrange:
        String romanNumeral = "I";
        main.java.RomanNumerals rn = new main.java.RomanNumerals(romanNumeral);
        Integer expected = 1;
        Integer actual = rn.arabicNumerals;

        // Assert
        assertEquals(expected, actual);
    }

}