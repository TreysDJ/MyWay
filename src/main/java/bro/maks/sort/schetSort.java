package bro.maks.sort;

import java.util.Scanner;

public class schetSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int[] b = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        countSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countSort(int[] arr) {
        int maxValue = 11;
        int[] count = new int[maxValue];

        for (int j = 0; j < arr.length; j++) {
            count[arr[j]] = count[arr[j]] + 1;
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
