package CCCPractice.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC10S1
{
    private static int[] order;
    public static void main(String[]args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] computers = new String[N][4];
        order = new int[N];
        for(int i = 0; i< N; i++)
        {
            computers[i] = br.readLine().split(" ");
        }

        for(int i = 0; i < N; i++)
        {
            int a = Integer.parseInt(computers[i][1]);
            int b = Integer.parseInt(computers[i][2]);
            int c = Integer.parseInt(computers[i][3]);

            int score = 2* a + 3 * b + c;
            order[i] = score;
        }

        int counter1 = 0, counter2 = 0;
        for(int cur : order)
        {
        }

    }
}
