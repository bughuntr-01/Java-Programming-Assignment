package Assignment_1;

import java.util.Scanner;
public class Product_of_Digits {
    
    static int productOfDigits(int n) {
        if (n == 0) {
            return 1; 
        }
        return (n % 10) * productOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int product = productOfDigits(n);
        System.out.println("Product of digits of " + n + " is: " + product);
    }
}
