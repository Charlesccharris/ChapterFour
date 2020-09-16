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

	Scanner input = new Scanner(System.in);
	String hexString = input.nextLine();

	if(hexString.length() != 1){
	  System.out.println("You must enter exactly one character");
	  System.exit(1);
	}

	char ch = hexString.charAt(0);
	if(ch <= 'F' && ch >= 'A'){
	  int value = ch - 'A' + 10;
	  System.out.println("The decimal value for hex digit " + ch + " is " + value);
	}

	else if(Character.isDigit(ch)){
	  System.out.println("The decimal value for hex digit " + ch + " is " + ch);
	}

	else{
	  System.out.println(ch + " is an invalid input");
	}

	}
}
