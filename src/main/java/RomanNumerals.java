import java.util.*;
// Class for Roman Numerals
// Converts Roman Numerals to Arabic Numerals and vice versa
public class RomanNumerals {
    private static final Map<Character, Integer> romanNumeralValues = new HashMap<>();
    private static final Map<Integer, String> arabicNumeralSymbols = new LinkedHashMap<>();
    static {
        romanNumeralValues.put('I', 1);
        romanNumeralValues.put('V', 5);
        romanNumeralValues.put('X', 10);
        romanNumeralValues.put('L', 50);
        romanNumeralValues.put('C', 100);
        romanNumeralValues.put('D', 500);
        romanNumeralValues.put('M', 1000);

        arabicNumeralSymbols.put(1000, "M");
        arabicNumeralSymbols.put(900, "CM");
        arabicNumeralSymbols.put(500, "D");
        arabicNumeralSymbols.put(400, "CD");
        arabicNumeralSymbols.put(100, "C");
        arabicNumeralSymbols.put(90, "XC");
        arabicNumeralSymbols.put(50, "L");
        arabicNumeralSymbols.put(40, "XL");
        arabicNumeralSymbols.put(10, "X");
        arabicNumeralSymbols.put(9, "IX");
        arabicNumeralSymbols.put(5, "V");
        arabicNumeralSymbols.put(4, "IV");
        arabicNumeralSymbols.put(1, "I");
    }

    public Integer convertRomanToArabic(String romanNumeral) throws IllegalArgumentException {
        int arabicNumeral = 0;
        int prevValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            Character currentChar = romanNumeral.charAt(i);
            Integer currentValue = romanNumeralValues.get(currentChar);
            if (currentValue == null) {
                throw new IllegalArgumentException("Invalid Roman numeral: " + romanNumeral);
            }
            if (currentValue < prevValue) {
                arabicNumeral -= currentValue;
            } else {
                arabicNumeral += currentValue;
            }
            prevValue = currentValue;
        }
        return arabicNumeral;
    }

    public String convertArabicToRoman(int arabicNumeral) {
        if (arabicNumeral <= 0 || arabicNumeral > 3999) {
            throw new IllegalArgumentException("Invalid Arabic numeral: " + arabicNumeral);
        }
        StringBuilder romanNumeral = new StringBuilder();
        for (Map.Entry<Integer, String> entry : arabicNumeralSymbols.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            while (arabicNumeral >= value) {
                arabicNumeral -= value;
                romanNumeral.append(symbol);
            }
        }
        return romanNumeral.toString();
    }
}
