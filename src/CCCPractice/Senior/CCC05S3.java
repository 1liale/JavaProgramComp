package CCCPractice.Senior;

import java.io.*;
import java.util.*;

public class CCC05S3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[][] a = new int[1024][1024];
        int[][] b = new int[1024][1024];
        int[][] result = new int[1024][1024];

        // bx and by are initialized as ones for first iteration
        int bx = 1;
        int by = 1;
        int ax = 0;
        int ay = 0;
        b[0][0] = 1;

        int N = readInt();
        // Reading inputs
        for (int i = 0; i < N; i++) {
            ax = readInt();
            ay = readInt();

            // Take input for first array
            for (int j = 0; j < ax; j++) {
                for (int k = 0; k < ay; k++) {
                    a[j][k] = readInt();
                    //System.out.println(a[j][k]);
                }
            }

            // Calculate resulting array
            for (int j = 0; j < ax * bx; j++) {
                for (int k = 0; k < ay * by; k++) {
                    // IQ 200 move: how to multiply each element of a 2D array by another 2D array
                    result[j][k] = a[j / bx][k / by] * b[j % bx][k % by];
                }
            }

            // Increases set array size for every additional array
            bx *= ax;
            by *= ay;

            // Store the array in result into b
            for (int j = 0; j < bx; j++) {
                for (int k = 0; k < by; k++) {
                    b[j][k] = result[j][k];
                }
            }
        }

        int maxe = Integer.MIN_VALUE;
        int mine = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int minr = Integer.MAX_VALUE;
        int maxc = Integer.MIN_VALUE;
        int minc = Integer.MAX_VALUE;
        for (int j = 0; j < bx; j++) {
            int sum = 0;
            for (int k = 0; k < by; k++) {
                sum += b[j][k];
                maxe = Math.max(b[j][k], maxe);
                mine = Math.min(b[j][k], mine);
            }
            maxr = Math.max(sum, maxr);
            minr = Math.min(sum, minr);
        }

        for (int j = 0; j < bx; j++) {
            int sum = 0;
            for (int k = 0; k < by; k++) {
                sum += b[j][k];
            }
            maxc = Math.max(sum, maxc);
            minc = Math.min(sum, minc);
        }

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",maxe,mine,maxr,minr,maxc,minc);
    }

    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }

}
