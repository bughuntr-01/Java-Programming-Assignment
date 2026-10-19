package Assignment_1;

import java.util.Scanner;
public class Odd_Numbers_from_1_to_N {
    static void printOddNumbers(int n) {
        if (n <= 0) {
            return;
        }
        printOddNumbers(n - 1);
        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printOddNumbers(n);
    }
}
