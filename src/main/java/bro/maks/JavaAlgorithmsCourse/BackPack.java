package bro.maks.JavaAlgorithmsCourse;

import java.util.Scanner;

public class BackPack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();

        int[] weights = new int[n];
        int[][] backpack = new int[n + 1][w + 1];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        for (int a = 0; a <= n; a++) {
            backpack[a][0] = 0;
        }
        for (int b = 0; b <= w; b++) {
            backpack[0][b] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= weights[i- 1]) {
                    backpack[i][j] = Math.max(backpack[i - 1][j], weights[i - 1] + backpack[i - 1][j - weights[i - 1]]);
                } else {
                    backpack[i][j] = backpack[i - 1][j];
                }
            }
        }
        System.out.println(backpack[n][w]);
    }
}
