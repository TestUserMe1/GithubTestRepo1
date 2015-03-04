import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating two integer variables to store the input values in
		// calculator
		int number1;
		int number2;
		int number3;
		int choiceOfOperation;
		
		// prompting user to input two numbers
		System.out.println("Enter two numbers for the calculator A & B");

		// Creating scanner object to store typed numbers
		Scanner disha1 = new Scanner(System.in);
		number1 = disha1.nextInt();
		number2 = disha1.nextInt();

		// print out the two entered numbers
		System.out.println("Two numbers you entered are  " + number1 + "    "
				+ number2);

		// give users choices to select what they wish to do
		System.out.println("Input the operation you would like to perform:\n1. Addition \n2. multiplication \n");
		
		choiceOfOperation = disha1.nextInt();
		
		System.out.println("You entered choice " + choiceOfOperation);
		
		Calculate object1 = new Calculate();
		
		if(choiceOfOperation==1){
			System.out.println("Addition is "+ object1.addition(number1, number2));
			System.out.println("------program ends-------");
		}
		
		if(choiceOfOperation==2){
			System.out.println("Multiplication is "+ object1.multiplication(number1, number2));
			System.out.println("------program ends-------");
		}
			
		if(choiceOfOperation==3){
			
		}
		
		if(choiceOfOperation==4){
			
		}
	}

}