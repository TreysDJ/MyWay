package bro.maks.Algorithms.HfCode.Codeforces;

import java.util.Scanner;

public class letterToHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();

            int steps = 0;

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            int first = arr[0];
            int last = arr[arr.length - 1];

            if (s >= last) {
                steps = s - first;
                System.out.println(steps);
                continue;
            }
            if (s <= arr[0]) {
                steps = last - s;
                System.out.println(steps);
                continue;
            }
            if (s - first <= last - s) {
                steps = (s - first) + (last - first);
                System.out.println(steps);
                continue;
            }
            if (s - first > last - s) {
                steps = (last - s) + (last - first);
            }
            System.out.println(steps);
        }
    }
}
