import java.util.Scanner;

class HomeWork4_10{
	public static void main(String[] args){
	/*4.10 (Guess birthday)
	Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to enter the character
	Y for Yes and N for No rather than entering 1 for Yes and 0 for No.*/

	Scanner input = new Scanner(System.in);

	String set1 =
	" 1  3  5  7\n"+
	" 9 11 13 15\n"+
	"17 18 21 23\n"+
	"25 27 29 31\n";

	String set2 =
	" 2  3  6  7\n"+
	"10 11 14 15\n"+
	"18 19 22 23\n"+
	"26 27 30 31\n";

	String set3 =
	" 4  5  6  7\n"+
	"12 13 14 15\n"+
	"20 21 22 23\n"+
	"28 29 30 31\n";

	String set4 =
	" 8  9 10 11\n"+
	"12 13 14 15\n"+
	"24 25 26 27\n"+
	"28 29 30 31\n";

	String set5 =
	"16 17 18 19\n"+
	"20 21 22 23\n"+
	"24 25 26 27\n"+
	"28 29 30 31\n";

	int day = 0;

	System.out.print("Is your birthday in Set1?\n");
	System.out.print(set1);
	System.out.print("\nEnter 0 for No and 1 for Yes: ");
	int answer = input.nextInt();

	if(answer == 1)
	  day += 1;

	System.out.print("Is your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
          day += 2;

	System.out.print("Is your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
          day += 4;

	System.out.print("Is your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
          day += 8;

	System.out.print("Is your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
          day += 16;

	System.out.println("\nYour birthday is " + day +"!");
	}
}