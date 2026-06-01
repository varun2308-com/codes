import java.util.Scanner;
class ArrayExercise5 {
	public static void main(String args[]) {
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, searchValue = 0;
		
		int[] numArr = null;
		String output = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter number 2: ");
		num2 = sc.nextInt();
		
		System.out.print("Enter number 3: ");
		num3 = sc.nextInt();
		
		System.out.print("Enter number 4: ");
		num4 = sc.nextInt();
		
		System.out.print("Enter number 5: ");
		num5 = sc.nextInt();
		
		System.out.print("Enter value to find index: ");
		searchValue = sc.nextInt();
		
		numArr = new int[]{num1, num2, num3, num4, num5};
		
		for (int index = 0; index < numArr.length; index++) {
			if (numArr[index] == searchValue) {
				output += index + " ";
			}
		}
		
		System.out.println(output);
	}
}
		
		