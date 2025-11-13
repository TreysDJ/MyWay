package bro.maks.brawl;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number + 1];
        int result = fibonacci(arr, number);
        System.out.println(result);
    }

    public static int fibonacci(int[] arr, int number) {
        if (arr[number] == 0) {
            if (number <= 1) {
                arr[number] = number;
            } else {
                arr[number] = fibonacci(arr, number - 1) + fibonacci(arr, number - 2);
            }
        }
        return arr[number];
    }
}
