package Assignment_1;

import java.util.Scanner;
public class Count_Digits_of_a_Number {
    
    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count = countDigits(n);
        System.out.println("Count of digits of " + n + " is: " + count);
    }
}
