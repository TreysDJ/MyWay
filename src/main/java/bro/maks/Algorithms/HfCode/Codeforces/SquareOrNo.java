package bro.maks.Algorithms.HfCode.Codeforces;

import java.util.Scanner;

public class SquareOrNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMuch = scanner.nextInt();
        for (int i = 0; i < howMuch; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a == b && a == c && a == d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
