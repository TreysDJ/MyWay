package bro.maks.Algorithms.HfCode.Codeforces;

import java.util.Scanner;

public class SquareYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long s = scanner.nextInt();
            if (s == 0000) {
                System.out.println("0 0");
                continue;
            }
            double sqrt = Math.sqrt(s);

            long a;
            long b;
            long integerSqrt = (long) sqrt;
            if (integerSqrt * integerSqrt == s) {
                if (sqrt % 2 == 0) {
                    a = (int) (sqrt / 2 - 1);
                    b = (int) (sqrt / 2 + 1);
                } else {
                    a = (int) Math.floor(sqrt / 2);
                    b = (int) Math.ceil(sqrt / 2);
                }
                System.out.println(a + " " + b);
            } else {
                System.out.println("-1");
            }
        }
    }
}
