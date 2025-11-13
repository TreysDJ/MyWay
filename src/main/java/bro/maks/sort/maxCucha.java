package bro.maks.sort;

import java.util.Scanner;

public class maxCucha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            int number = scanner.nextInt();
            add(arr, number);
        }
    }

    public static void add(int[] arr, int number) {
        arr[arr.length - 1] = number;
        boolean sort = true;
        while (!sort) {

        }
    }

    public static void remove(int[] arr) {

    }

    public static int getMax(int[] arr) {
        return arr[0];
    }
}
