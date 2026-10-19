package Assignment_1;
import java.util.Scanner;
public class Sum_of_First_N_Natural_Numbers {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }
}
