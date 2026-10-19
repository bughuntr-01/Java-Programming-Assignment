
package Assignment_1;

import java.util.Scanner;

public class Linear_Search_Using_Recursion {

    static int search(int[] arr, int n, int target) {
        if (n == arr.length) {
            return -1;
        }

        if (arr[n] == target) {
            return n;
        }

        return search(arr, n + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        System.out.println("Index: " + search(arr, 0, target));

    
    }
}
