import java.util.Scanner;

public class NumbersRangePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter two whole numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        
        for (int i = start; i <= end; i++) {
            System.out.print(i);
            if (i < end) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
