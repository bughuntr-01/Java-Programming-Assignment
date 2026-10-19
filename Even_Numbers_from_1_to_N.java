package Assignment_1;
import java.util.Scanner;
public class Even_Numbers_from_1_to_N {
    static void printEvenNumbers(int n) {
        if (n <= 0) {
            return;
        }
        printEvenNumbers(n - 1);
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printEvenNumbers(n);
    }
}
