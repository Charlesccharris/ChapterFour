//1. Identify the problem
//2. Read up on substrings
//3. Code with constants
//4. Make sure code works
//5. Code inputs
//6. Check to see if code works

import java.util.Scanner;

class HomeWork4_22{
        public static void main(String[] args){
        /*(Check substring)
        Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
        Here is a sample run:
        Enter string s1: ABCD;
        Enter string s2: BC;
        BC is a substring of ABCD*/
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string of letters(capitalization matters): ");
        String inputOne = input.next();
	System.out.print("\nInput a smaller string of letters to see if it's a substring(capitalization matters): ");
        String inputTwo = input.next();

        if(inputOne.contains(inputTwo))
        	System.out.println("\n" + inputTwo + " is a substring of " + inputOne);
        else
		System.out.println("\n" + inputTwo + " isn't a substring of " + inputOne);

        }
}

