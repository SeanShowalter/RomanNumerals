import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean on = true;

        while (on) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a roman numeral: ");
            String str = sc.nextLine();
            str = str.toUpperCase();
            System.out.println("You have entered: " + str);
            main.java.RomanNumerals rn2 = new main.java.RomanNumerals(str);
            rn2.printConversion();

            System.out.print("Would you like to go again? [y/n]");
            String answer = sc.nextLine();
            answer.toLowerCase();
            if (answer.equals("n")) {
                on = false;
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }



   }
}