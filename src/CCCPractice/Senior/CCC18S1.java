package CCCPractice.Senior;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CCC18S1
{
//    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        double min = Double.MAX_VALUE;

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);

        for(int i = 1; i < n - 1; i++)
        {
            double dist = Math.abs(a[i] - a[i - 1]) / 2.0 + Math.abs(a[i] - a[i + 1]) / 2.0;
            min = Math.min(min, dist);
        }

        System.out.printf("%.1f\n",min);

    }
}
