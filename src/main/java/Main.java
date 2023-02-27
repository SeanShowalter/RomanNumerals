import java.util.Scanner;
/*
    Goal of this project is to convert Roman Numerals to Arabic Numerals, and vice verse
 */
public class Main {
    public static void main(String[] args) {

        boolean on = true;
        while (on) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Roman or Arabic numeral (1-3999): ");
            String inputNumeral = sc.nextLine();

            try {
                if (inputNumeral.matches("[IVXLCDMivxlcdm]+")) {
                    RomanNumerals rn = new RomanNumerals();
                    Integer arabicNumeral = rn.convertRomanToArabic(inputNumeral.toUpperCase());
                    System.out.println(arabicNumeral);
                } else if (inputNumeral.matches("\\d+")) {
                    int arabicNumeral = Integer.parseInt(inputNumeral);
                    RomanNumerals rn = new RomanNumerals();
                    String romanNumeral = rn.convertArabicToRoman(arabicNumeral);
                    System.out.println(romanNumeral);
                } else {
                    throw new IllegalArgumentException("Invalid input: " + inputNumeral);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Would you like to go again? [y/n]");
            String answer = sc.nextLine().toLowerCase();

            if (answer.equals("n")) {
                on = false;
            }
        }
   }
}