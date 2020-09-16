class DecToHex{
	public static void main(String[] args){

//	for(int userInput = 0; userInput <16; userInput++){
/*	int userInput = 8;
	String outLetter;

	if(userInput < 0 || userInput > 15){
	  System.out.println("Dude");
	  System.exit(1);
	}

	if(userInput >= 0 && userInput <= 9)
	 System.out.println(number + " is " + number);

	else if(number >= 10 && number <= 15){
	  outLetter = number - 10 + 'A';
	  System.out.println(number + " is " + outLetter);
	}
*/

	if (userInput < 10)
	System.out.println(userInput + " is " + userInput);
	else
	{
	 int remainder = userInput%10;
	 switch(remainder){
	 case 0: System.out.println("A");break;
         case 1: System.out.println("B");break;
         case 2: System.out.println("C");break;
         case 3: System.out.println("D");break;
         case 4: System.out.println("E");break;
         case 5: System.out.println("F");break;
	}
//	}

	}
	}
}
