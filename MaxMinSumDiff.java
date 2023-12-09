import java.util.*;
public class MaxMinSumDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter M (Mth maximum number): ");
        int m = s.nextInt();
        System.out.print("Enter N (Nth minimum number): ");
        int n = s.nextInt();
        int mthMax = findMthMaximum(arr, m);
        int nthMin = findNthMinimum(arr, n);

        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;

        System.out.println("Mth maximum number: " + mthMax);
        System.out.println("Nth minimum number: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

    }

    public static int findMthMaximum(int[] arr, int m) {
        if (m > arr.length || m <= 0) {
            return -1;
        }
        Arrays.sort(arr);
        return array[arr.length - m];
    }

    public static int findNthMinimum(int[] arr, int n) {
        if (n > arr.length || n <= 0) {
            return -1;
        }
        Arrays.sort(arr);
        return array[n - 1];
    }
}
