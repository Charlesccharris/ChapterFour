//1. Identify the problem
//2. Copy and paste the code
//3. Make sure code works
//4. Identify what needs to be modified with Strings.
//5. Make strings for the program
//6. Check to make sure program works

import java.util.Scanner;

class HomeWork4_10{
	public static void main(String[] args){
	/*4.10 (Guess birthday)
	Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to enter the character
	Y for Yes and N for No rather than entering 1 for Yes and 0 for No.*/

	Scanner input = new Scanner(System.in);

	String set1 = " 1  3  5  7\n 9 11 13 15\n17 18 21 23\n25 27 29 31\n";
	String set2 = " 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31\n";
	String set3 = " 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31\n";
	String set4 = " 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31\n";
	String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31\n";
	String monthSet1 =
	"Jamuary April July\nSeptember October December\n";
	String monthSet2 =
	"February May August\nNovember December\n";
	String monthSet3 =
	"March April May\nSeptember October December\n";
	String monthSet4 =
	"June July August\nSeptember October December\n";

	int day = 0;
	int month = 0;

	char Yes = 'Y';

        System.out.println("I will guess your birthday based on nine questions.\nFirst the Day.\n");

	System.out.print("\nIs your birth day in this set of numbers?\n");
	System.out.print(set1);
	System.out.print("\nEnter (Y)es or (N)o: ");
	int answer = input.next().charAt(0);

	if(Character.toUpperCase(answer) == Yes)
	  day += 1;

	System.out.print("\nIs your birth day in this set of numbers?\n");
        System.out.print(set2);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          day += 2;

	System.out.print("\nIs your birth day in this set of numbers?\n");
        System.out.print(set3);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          day += 4;

	System.out.print("\nIs your birth day in this set of numbers?\n");
        System.out.print(set4);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          day += 8;

	System.out.print("\nIs your birth day in this set of numbers?\n");
        System.out.print(set5);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          day += 16;

	//Guess for the month
	System.out.println("\nNow for the month\n");

	System.out.println("\nIs your birth month in this set?");
	System.out.print(monthSet1);
        System.out.print("\nEnter (Y)es or (N)o: ");
	answer = input.next().charAt(0);

	if(Character.toUpperCase(answer) == Yes)
	  month += 1;

        System.out.println("\nIs your birth month in this set?");
        System.out.print(monthSet2);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          month += 2;

        System.out.println("\nIs your birth month in this set?");
        System.out.print(monthSet3);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          month += 3;

        System.out.println("\nIs your birth month in this set?");
        System.out.print(monthSet4);
        System.out.print("\nEnter (Y)es or (N)o: ");
        answer = input.next().charAt(0);

        if(Character.toUpperCase(answer) == Yes)
          month += 6;

	switch(month){
		case 1:
			System.out.println("Your birthday is January, " + day + "!");
		break;

	        case 2:
			if(day == 29)
			System.out.println("Your birthday is February, " + day + "! You're a leap year baby!");
			else if(day > 29)
			System.out.println("Your birthday is February, " + day + "? That is physically impossible.");
			else
			System.out.println("Your birthday is February, " + day + "!");

		break;

	        case 3:
			System.out.println("Your birthday is March, " + day + "!");
		break;

	        case 4:
			System.out.println("Your birthday is April, " + day + "!");
		break;

	        case 5:
			System.out.println("Your birthday is May, " + day + "!");
		break;

	        case 6:
			System.out.println("Your birthday is June, " + day + "!");
		break;

	        case 7:
			System.out.println("Your birthday is July, " + day + "!");
		break;

        	case 8:
			System.out.println("Your birthday is August, " + day + "!");
		break;

        	case 9:
			System.out.println("Your birthday is September, " + day + "!");
		break;

        	case 10:
			System.out.println("Your birthday is October, " + day + "!");
		break;

        	case 11:
			System.out.println("Your birthday is November, " + day + "!");
		break;

        	case 12:
			System.out.println("Your birthday is December, " + day + "!");
		break;

		default:
			System.out.println("This shouldn't be possible");
		break;
		}
	}
}
