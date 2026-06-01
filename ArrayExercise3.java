import java.util.Scanner;
class ArrayExercise3 {
	public static void main(String args[]) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, result = 0;
		int[] numArr1 = null, numArr2 = null;
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
		
		numArr1 = new int[]{num1, num2, num3, num4, num5};
		
		numArr2 = new int[numArr1.length];
		
		for (int index = 0; index < numArr1.length; index++) {
			numArr2[index] = numArr1[index];
			}
		for (int value : numArr2) {
			output += value + " ";
			}
			System.out.println(output);
		}
	}	
		
		