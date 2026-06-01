import java.util.Scanner;
class ArrayExercise2 {
	public static void main(String args[]) {
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, result = 0;
		int[] numArr = null;
		double average = 0;
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
			
			numArr = new int[5];
			
			numArr[0] = num1;
			numArr[1] = num2;
			numArr[2] = num3;
			numArr[3] = num4;
			numArr[4] = num5;
			
			int sum = numArr[0] + numArr[1] + numArr[2] + numArr[3] + numArr[4] ;
			
			average = sum / 5.0;
			
			System.out.println(average);
		}
	
	}	