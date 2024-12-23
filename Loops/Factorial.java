import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to find its factorial :");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}
