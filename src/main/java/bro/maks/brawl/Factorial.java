package bro.maks.brawl;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int step = 0;
        int i = 0;
        int[] arr = new int[n + 1];
        while (sum <= n - 2 * (i + 1)) {
            sum += i;
            arr[i] = sum;
            step++;
            i++;
        }
        arr[arr.length - 1] = n - sum;
        System.out.println(step);
        for (int j : arr) {
            if (j == 0) {
                continue;
            }
            System.out.print(j + " ");
        }
    }

    public static class Inversion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int arrLength = scanner.nextInt();
            int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                int number = scanner.nextInt();
                arr[i] = number;
            }
            System.out.println(inversion(arr, 0, arr.length - 1, 0));
        }

        public static long inversion(int[] arr, int left, int right, long invCount) {
            if (left < right) {
                int mid = (left + right) / 2;
                invCount += inversion(arr, left, mid, 0);
                invCount += inversion(arr, mid + 1, right, 0);
                invCount += merge(arr, left, mid, right);
                return invCount;
            }
            return 0;
        }

        public static long merge(int[] a, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;
            int i, j;
            long cnt = 0;

            int[] L = new int[n1];
            int[] R = new int[n2];
            for (i = 0; i < n1; i++) {
                L[i] = a[left + i];
            }
            for (j = 0; j < n2; j++) {
                R[j] = a[mid + 1 + j];
            }

            i = j = 0;
            int k = left;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    a[k] = L[i];
                    i++;
                } else {
                    a[k] = R[j];
                    j++;
                    cnt += n1 - i;
                }
                k++;
            }

            while (i < n1) {
                a[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                a[k] = R[j];
                j++;
                k++;
            }

            return cnt;
        }
    }
}