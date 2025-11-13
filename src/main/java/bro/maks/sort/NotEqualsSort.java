package bro.maks.sort;

import java.util.Scanner;

public class NotEqualsSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        countSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void countSort(int[] arr) {
        int maxValue = 11;
        int[] count = new int[maxValue];

        for (int k : arr) {
            count[k] = count[k] + 1;
        }
        int currentIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[currentIndex] = i;
                currentIndex++;
            }
        }
    }
}
