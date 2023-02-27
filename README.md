# RomanNumerals
RomanNumerals

A Roman numeral represents an integer using letters. Examples are XVII to represent 17, MCMLIII for 1953, and MMMCCCIII for 3303. By contrast, ordinary numbers such as 17 or 1953 are called Arabic numerals. The following table shows the Arabic equivalent of all the single-letter Roman numerals:
Roman Numeral 	Decimal Equivalent
M 	1000
D 	500
C 	100
L 	50
X 	10
V 	5
I 	1

When letters are strung together, the values of the letters are just added up, with the following exception. When a letter of smaller value is followed by a letter of larger value, the smaller value is subtracted from the larger value.

    For example, IV represents 5 - 1, or 4.
    And MCMXCV is interpreted as M + CM + XC + V, or 1000 + (1000 - 100) + (100 - 10) + 5, which is 1995.

In standard Roman numerals, no more than three consecutive copies of the same letter are used. Following these rules, every number between 1 and 3999 can be represented as a Roman numeral made up of the following one- and two-letter combinations:
Roman Numeral 	Decimal Equivalent
M 	1000
CM 	900
D 	500
CD 	400
C 	100
XC 	90
L 	50
XL 	40
X 	10
IX 	9
V 	5
IV 	4
I 	1

INSTRUCTIONS

Write a class to represent Roman numerals. 

The class should have two constructors. 

One constructs a Roman numeral from a string such as "XVII" or "MCMXCV". 
It should throw a NumberFormatException if the string is not a legal
Roman numeral. 

The other constructor constructs a Roman numeral from an int.
It should throw a NumberFormatException if the int is outside the 
range 1 to 3999.

In addition, the class should have two instance methods. 

The method toString() returns the string that represents the Roman numeral.
The method toInt() returns the value of the Roman numeral as an int.

At some point in your class, you will have to convert an int into the 
string that represents the corresponding Roman numeral. One way to approach
this is to gradually "move" value from the Arabic numeral to the Roman numeral. 
Here is the beginning of a routine that will do this, where number is the int 
that is to be converted:

    String roman = "";
    int N = number;
    while (N >= 1000) {
    // Move 1000 from N to roman.
    roman += "M";
    N -= 1000;
    }
    while (N >= 900) {
    // Move 900 from N to roman.
    roman += "CM";
    N -= 900;
    }
    .
    .  // Continue with other values from the above table.

Once you've written your class, use it in a main program that will
read both Arabic numerals and Roman numerals entered by the user. 
If the user enters an Arabic numeral, print the corresponding Roman
numeral. If the user enters a Roman numeral, print the corresponding
Arabic numeral. (You can tell the difference by using TextIO.peek() 
to peek at the first character in the user's input (see Subsection 
8.2.2). If the first character is a digit, then the user's input is 
an Arabic numeral. Otherwise, it's a Roman numeral.) 

The program should end when the user inputs an empty line.

Alea iacta est. (The die has been cast...)