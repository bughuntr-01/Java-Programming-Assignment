package Assignment_1;

import java.util.Scanner;
public class GCD_of_Two_Numbers {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}
