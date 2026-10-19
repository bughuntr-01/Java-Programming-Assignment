
package Assignment_1;

import java.util.Scanner;

public class Binary_Search_Using_Recursion {

    static int binary(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            int result = binary(arr, low, mid - 1, target);

            if (result != -1) {
                return result;
            }

            return mid;
        }

        if (target < arr[mid]) {
            return binary(arr, low, mid - 1, target);
        } else {
            return binary(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int result = binary(arr, 0, n - 1, target);

        System.out.println("Index: " + result);

    }
}
