package Assignment_1;

import java.util.Scanner;
public class Check_Whether_Array_Is_Sorted {
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr, 0);
        if (result) {
            System.out.println("The array is sorted...!!!");
        } else {
            System.out.println("The array is not sorted...!!!");
        }
    }
}
