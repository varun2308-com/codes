import java.util.Scanner;
class NaturalNumbers {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int startNumber = 0, endNumber = 0, naturalNumber = 0;
	
	 startNumber = sc.nextInt();
	 endNumber = sc.nextInt();
		for (int num = startNumber; num <= endNumber; num++) {
			naturalNumber = num;
		//for (; startNumber <=  endNumber; startNumber++ ) {
		//naturalNumber = startNumber;
		}
		System.out.println(naturalNumber);
		}
		}
		
	