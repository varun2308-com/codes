import java.util.Scanner;

class ArrayExercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Enter value to find index: ");
        int searchValue = scanner.nextInt();

        String result = "";
        
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                result += i + " ";
            }
        }

        System.out.println(result);
    }
}
