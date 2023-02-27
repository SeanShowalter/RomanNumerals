import java.util.*;
// Class for Roman Numerals
public class RomanNumerals {
    Integer arabicNumerals = 0;
    String romanNumerals;

    // Create a hashMap of Roman Numerals to Decimals
     Map<String, Integer> map = new HashMap<>();



    public RomanNumerals(String romanNumerals) {
        this.romanNumerals = romanNumerals;
        this.createTable();
        this.toInt();
    }

    public RomanNumerals(Integer arabicNumerals) {
        this.arabicNumerals = arabicNumerals;
        this.createTable();
    }

    public void createTable() {
        this.map.put("M", 1000);
        this.map.put("CM", 900);
        this.map.put("D", 500);
        this.map.put("CD", 400);
        this.map.put("C", 100);
        this.map.put("XC", 90);
        this.map.put("L", 50);
        this.map.put("XL", 40);
        this.map.put("X", 10);
        this.map.put("IX", 9);
        this.map.put("V", 5);
        this.map.put("IV", 4);
        this.map.put("I", 1);
    }

    public void toInt() {
        //char[] arr = this.romanNumerals.toCharArray();
        char[] chars = this.romanNumerals.toCharArray();
        //System.out.println(str.length());
        for (int i = 0; i < chars.length; i++) {
            // check that we are not on the last index
            StringBuilder a = new StringBuilder();
            if (i != chars.length -1) {
                // combine a and b into one string and see if it is in the table
                a.append(chars[i]);
                String str = String.valueOf(chars[i]) +
                        chars[i + 1];
                Integer match = this.getArabicNumeral(str);
                if (match != null) {
                    //System.out.println("String matched: " + str);
                    this.arabicNumerals += match;
                    //System.out.println("Updated arabicNumerals: " + this.arabicNumerals);
                    i++; // this will move i forward to the next letter
                } else {
                    // will find single value
                    String str2 = a.toString();
                    Integer match2 = this.getArabicNumeral(str2);
                    //System.out.println("String matched: " + str2);
                    this.arabicNumerals += match2;
                    //System.out.println("Updated arabicNumerals: " + this.arabicNumerals);
                }
            } else {
                // look up roman numeral value in table and return number
                //System.out.println(("This is the last index!"));
                a.append(chars[i]);
                String str = a.toString();
                Integer match = this.getArabicNumeral(str);
                this.arabicNumerals += match;
                //System.out.println("Updated arabicNumerals: " + this.arabicNumerals);
            }
        }
    }


//    public void printTable() {
//        Iterator<Map.Entry<String, Integer>> entrySet = this.map.entrySet().iterator();
//
//        while (entrySet.hasNext()) {
//            Map.Entry<String, Integer> entry = entrySet.next();
//            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//
//        }
//    }

    // Looks up value of Roman Numeral and returns its Arabic Number
    public Integer getArabicNumeral(String romanNumeral) {
        return this.map.get(romanNumeral);
    }

    public void printConversion() {
        //System.out.println("Roman Numeral\tArabic Equivalent");
        //System.out.println(this.romanNumerals + "=" + this.arabicNumerals);
        System.out.println("The arabic equivalent is: " + this.arabicNumerals);
    }
}
