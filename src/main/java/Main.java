import java.util.Scanner;
/*
    Goal of this project is to convert Roman Numerals to Arabic Numerals, and vice verse
 */
public class Main {
    public static void main(String[] args) {

        boolean on = true;

        while (on) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a roman numeral: ");
            String str = sc.nextLine();
            str = str.toUpperCase();
            System.out.println("You have entered: " + str);
            RomanNumerals rn2 = new RomanNumerals(str);
            rn2.printConversion();

            System.out.print("Would you like to go again? [y/n]");
            String answer = sc.nextLine();
            answer = answer.toLowerCase();
            if (answer.equals("n")) {
                on = false;
            }
        }



   }
}