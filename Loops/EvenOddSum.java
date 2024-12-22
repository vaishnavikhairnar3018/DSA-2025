import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers :");
        int n = sc.nextInt();

        int evensum = 0;
        int oddsum = 0;

        System.out.println("Enter the integers :");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
    }
}
