package Assignment_1;

import java.util.Scanner;
public class Reverse_a_Number {
    
    static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseNumber(n / 10, rev);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = sc.nextInt();
        int reversedNum = reverseNumber(num, 0);
        System.out.println("Reversed Number: " + reversedNum);
    }
}
