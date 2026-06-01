import java.util.Scanner;
class MainProgram {
	public static void main(String args[]) {
		int firstNumber = 0, secondNumber = 0, result = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Number 1: ");
			firstNumber = sc.nextInt();
			System.out.print("Enter Number 2: ");
			secondNumber = sc.nextInt();
			
		Addition addition = new Addition();
		Division division = new Division();
		Subtraction subtraction = new Subtraction();
		Multiplication multiplication = new Multiplication();
	
		addition.add(firstNumber, secondNumber);
		division.divide(firstNumber, secondNumber);
		subtraction.subtract(firstNumber, secondNumber);
		multiplication.multiply(firstNumber, secondNumber);
	}
}	
			
			
