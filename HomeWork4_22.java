//1. Identify the problem
//2. Copy and paste code
//3. Make sure code works
//4. Identify what needs to be modified
//5. Make the modifications
//6. Check to see if code works

class HomeWork4_22{
	public static void main(String[] args){
	/*(Check substring)
	Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
	Here is a sample run:
	Enter string s1: ABCD;
	Enter string s2: BC;
	BC is a substring of ABCD*/
	String inputOne = "ABCD";
	String inputTwo = "CD";

	System.out.println("inputOne is " + inputOne + " and inputTwo is " + inputTwo);
	if(inputOne.contains(inputTwo))
	System.out.println("Hi");
	else
	System.out.println("bye");

//	String(userInput).equals(send);
//	answer.equals "Yes";
	}
}
