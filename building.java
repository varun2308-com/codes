import java.util.Scanner;
class building {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:
		System.out.println("soda");
		break;
		case 2:
		System.out.println("chips");
		break;
		case 3:
		System.out.println("candy");
		break;
		default:
		System.out.println("Invalid Selection");
		}
		}
}