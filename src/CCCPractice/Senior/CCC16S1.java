package CCCPractice.Senior;

import java.util.Arrays;
import java.util.Scanner;

public class CCC16S1 {
    private static int alpha[] = new int[1000];

    public static void main(String[] args) {
        Arrays.fill(alpha, -1);

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int counter = 0;
        for (char c : str1.toCharArray()) {
            if (alpha[c] == -1) {
                alpha[c] = 1;
            } else {
                alpha[c]++;
            }
        }

        for (char c : str2.toCharArray()) {
            if (c != '*') {
                if (alpha[c] > 0) {
                    alpha[c]--;
                }
            } else {
                counter++;
            }
        }

        int sum = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > 0) {
                sum += alpha[i];
            }
        }

        if (sum == counter) {
            System.out.println("A");
        } else {
            System.out.println("N");
        }
    }
}
