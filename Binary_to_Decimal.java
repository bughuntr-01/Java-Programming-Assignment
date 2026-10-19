package Assignment_1;

import java.util.Scanner;
public class Binary_to_Decimal {
    static int decimal(int n,int power){
    if(n == 0){
        return 0;
    }
    return (n % 10) * power + decimal(n/10,power * 2);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n = sc.nextInt();
        System.out.print(decimal(n,1));
    }
}
