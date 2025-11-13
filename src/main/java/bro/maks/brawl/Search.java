package bro.maks.brawl;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }
        int numbersLength = scanner.nextInt();
        int[] numbersArr = new int[numbersLength];
        for (int i = 0; i < numbersArr.length; i++) {
            int number = scanner.nextInt();
            numbersArr[i] = number;
        }
        for (int j = 0; j < numbersLength; j++) {
            int left = 0;
            int right = arr.length - 1;
        }
        for (int number : numbersArr) {
            System.out.print(number + " ");
        }
    }

    public static int biSearchLeft(int[] arr, int start, int end, int dot, int currentLeft) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (arr[middle] == dot) {
            return arr[middle];
        }
        if (arr[middle] > dot) {
            return biSearchLeft(arr, start, middle - 1, dot, currentLeft);
        }
        if (arr[middle] < dot) {
            return biSearchLeft(arr, middle + 1, end, dot, currentLeft);
        }
        return -1;
    }
}

