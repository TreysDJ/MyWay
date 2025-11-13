package bro.maks.Algorithms.HfCode.Codeforces;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String t = scanner.next();
            String[] sArrChar = s.split("");
            String[] tArrChar = t.split("");
            boolean equals = true;
            for (int j = 0; j < n; j++) {
                if (!equals) {
                    break;
                }
                int sSum = 0;
                int tSum = 0;
                for (int a = 0; a < n; a++) {
                    if (sArrChar[j].equals(sArrChar[a])) {
                        sSum++;
                    }
                }
                for (int b = 0; b < n; b++) {
                    if (sArrChar[j].equals(tArrChar[b])) {
                        tSum++;
                    }
                }
                if (sSum != tSum) {
                    equals = false;
                }
            }
            if (equals) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
