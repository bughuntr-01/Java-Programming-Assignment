package Amrendra_problems;
//------------------------print 1 to n using recurssion---------------------------------

import java.util.Scanner;
public class print_1_to_n {

    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printNumbers(n);
    }
    
    
}
