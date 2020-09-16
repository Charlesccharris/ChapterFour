//1. Identify the problem
//2. Copy and paste code
//3. Make sure code works
//4. Identify what needs to be modified
//5. Make the modifications
//6. Check to see if code works

import java.util.Scanner;

class HomeWork4_11{
	public static void main(String[] args){
	/*(Decimal to hex)
	Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
	Here are some sample runs:
	Enter a decimal value (0 to 15): 11 The hex value is B;
	Enter a decimal value (0 to 15): 5; The hex value is 5;
	Enter a decimal value (0 to 15): 31 31 is an invalid input*/

	int number;
	Scanner input = new Scanner(System.in);
	System.out.print("To find hex from decimal, input a number between 0 and 15: ");
	number = input.nextInt();

	if(number >= 16){
	  System.out.println("You must enter 0 - 15");
	  System.exit(1);
	}

	if(number <= 15 && number >= 10){
          char value = (char)(number - 10 + 'A');
	  System.out.println("The hexidecimal value for decimal digit " + number + " is " + value);
	}

	else if(number <= 9) {
	  System.out.println("The hexidecimal value for decimal digit " + number + " is " + number);
	}
	else{
	  System.out.println(number + " is an invalid input");
	}

	}
}
