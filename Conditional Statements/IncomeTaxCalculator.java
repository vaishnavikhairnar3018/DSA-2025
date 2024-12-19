import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // 1) Income < 5L
        // 0% Tax
        // 2) Income between 5-10L
        // 20% Tax
        // 3) Income > 10L
        // 30% Tax

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income <= 1000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is :" + tax);
    }
}
