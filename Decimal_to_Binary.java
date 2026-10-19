package Assignment_1;

import java.util.Scanner;
public class Decimal_to_Binary {
    static void  binary(int n){
    if(n == 0){
        return;
    }
    binary(n/2);
    System.out.print(n %2);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n = sc.nextInt();
        binary(n);
    }
}
