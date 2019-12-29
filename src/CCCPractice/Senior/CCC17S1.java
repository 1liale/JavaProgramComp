package CCCPractice.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CCC17S1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];

        String[] str1 = br.readLine().split(" ");
        for(int i = 0; i < a; i++) {
            arr1[i] = Integer.parseInt(str1[i]);
        }

        String[] str2 = br.readLine().split(" ");
        for(int i = 0; i < a; i++) {
            arr2[i] = Integer.parseInt(str2[i]);
        }

        int sum1 = 0;
        int sum2 = 0;
        int counter = 0;
        boolean condition = false;

        for (int i = 0; i < a; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
            if (sum1 == sum2) {
                condition = true;
                counter = i+1;
            }
        }

        if (condition) {
            System.out.println(counter);
        } else {
            System.out.println(0);
        }
    }
}
