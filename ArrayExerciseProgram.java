import java.util.Scanner;
class ArrayExerciseProgram {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
	int rollnumber = 0, subject1marks = 0, subject2marks = 0, subject3marks = 0, subject4marks = 0, subject5marks = 0, noOfStudents = 0;
		int [][] studentArr = null;
		
		System.out.print("Enter the noOfStudents : ");
		noOfStudents = sc.nextInt();
		studentArr = new int[noOfStudents][6];
		for (int index = 0; index < noOfStudents; index++) {
		
		System.out.print("Enter rollnumber : ");
		rollnumber = sc.nextInt();
		
		System.out.print("Enter subject1marks : ");
		subject1marks = sc.nextInt();
		
		System.out.print("Enter subject2marks : ");
		subject2marks = sc.nextInt();
		
		System.out.print("Enter subject3marks : ");
		subject3marks = sc.nextInt();
		
		System.out.print("Enter subject4marks : ");
		subject4marks = sc.nextInt();
		
		System.out.print("Enter subject5marks : ");
		subject5marks = sc.nextInt();
		
		
		studentArr[index][0] = rollnumber;
		studentArr[index][1] = subject1marks;
		studentArr[index][2] = subject2marks;
		studentArr[index][3] = subject3marks;
		studentArr[index][4] = subject4marks;
		studentArr[index][5] = subject5marks;
		
		System.out.println("stored data sucessfully");
		}
		
		for (int index1 = 0; index1 < studentArr.length; index1++) {
			for (int index2 = 0; index2 < studentArr[index1].length; index2++) {
			int columnValue = studentArr[index1][index2]; 
	System.out.print(columnValue + " ");
	}
	System.out.println();
		}
	}
}
		
		

		
		
		
	