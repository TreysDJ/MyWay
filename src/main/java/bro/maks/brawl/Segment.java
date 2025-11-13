package bro.maks.brawl;

import java.util.Arrays;
import java.util.Scanner;

public class Segment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountSelect = scanner.nextInt();
        int amountDot = scanner.nextInt();

        int[] dots = new int[amountDot];

        int[] selectStart = new int[amountSelect];
        int[] selectEnd = new int[amountSelect];

        for (int i = 0; i < amountSelect; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            selectStart[i] = left;
            selectEnd[i] = right;
        }


        for (int i = 0; i < amountDot; i++) {
            dots[i] = scanner.nextInt();
        }

        //logic...
        Arrays.sort(selectStart);
        Arrays.sort(selectEnd);
        for (int i = 0; i < dots.length; i++) {
            int a = biSearchLeft(selectStart, 0, selectStart.length - 1, dots[i], 0);
            int b = biSearchRight(selectEnd, 0, selectEnd.length - 1, dots[i], 0);
            System.out.print(a - b + " ");
        }

    }

    public static int biSearchLeft(int[] arr, int start, int end, int dot, int currentLeft) {
        if (start > end) {
            return currentLeft;
        }
        int middle = (start + end) / 2;
        if (arr[middle] > dot) {
            return biSearchLeft(arr, start, middle - 1, dot, currentLeft);
        }
        if (arr[middle] <= dot) {
            currentLeft = middle + 1;
            return biSearchLeft(arr, middle + 1, end, dot, currentLeft);
        }
        return currentLeft;
    }

    public static int biSearchRight(int[] arr, int start, int end, int dot, int currentRight) {
        if (start > end) {
            return currentRight;
        }
        int middle = (start + end) / 2;
        if (arr[middle] >= dot) {
            return biSearchRight(arr, start, middle - 1, dot, currentRight);
        }
        if (arr[middle] < dot) {
            currentRight = middle + 1;
            return biSearchRight(arr, middle + 1, end, dot, currentRight);
        }
        return currentRight;
    }
}

