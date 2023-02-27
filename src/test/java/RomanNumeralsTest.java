import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Tests for Roman Numerals

class RomanNumeralsTest {
    // This test will see if the constructor can be created with a String

    @Test
    public void convert_romanNumeral_15() {
        RomanNumerals rn = new RomanNumerals();
        // Arrange:
        String romanNumeral = "XV";
        Integer expected = 15;
        Integer actual = rn.convertRomanToArabic(romanNumeral);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
        public void convert_romanNumeral_3500() {
            // Arrange:
            RomanNumerals rn = new RomanNumerals();
            String romanNumeral = "MMMD";
            Integer expected = 3500;
            Integer actual = rn.convertRomanToArabic(romanNumeral);

            // Assert
            assertEquals(expected, actual);
    }

    @Test
    public void convert_romanNumeral_2753() {
        // Arrange:
        RomanNumerals rn = new RomanNumerals();
        String romanNumeral = "MMDCCLIII";
        Integer expected = 2753;
        Integer actual = rn.convertRomanToArabic(romanNumeral);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void convert_romanNumeral_1() {
        // Arrange:
        RomanNumerals rn = new RomanNumerals();
        String romanNumeral = "I";
        Integer expected = 1;
        Integer actual = rn.convertRomanToArabic(romanNumeral);

        // Assert
        assertEquals(expected, actual);
    }
    @Test
    public void arabic_To_Roman_10() {
        RomanNumerals rn = new RomanNumerals();
        int arabicNumeral = 10;
        String expected = "X";
        String actual = rn.convertArabicToRoman(arabicNumeral);
        assertEquals(expected,actual);
    }

    @Test
    public void arabic_To_Roman_1023() {
        RomanNumerals rn = new RomanNumerals();
        int arabicNumeral = 1023;
        String expected = "MXXIII";
        String actual = rn.convertArabicToRoman(arabicNumeral);
        assertEquals(expected,actual);
    }


}