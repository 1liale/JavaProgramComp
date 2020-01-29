package CCCPractice.Senior;

import java.util.Arrays;
import java.util.Scanner;

public class CCC17S2 {
    private static int[] array1;
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        array1 = new int[N];
        for(int i = 0; i< N; i++)
        {
            array1[i] = sc.nextInt();
        }
        Arrays.sort(array1);

        if(array1.length % 2 == 0)
        {
            int lowIndex = array1.length/2-1;
            int highIndex = lowIndex+1;
            for(int i = 0; i < array1.length/2; i++){
                System.out.print(array1[lowIndex] +" "+ array1[highIndex]+" ");
                lowIndex--;
                highIndex++;
            }
        }
        else
        {
            int lowIndex = array1.length/2;
            int highIndex = lowIndex+1;
            for(int i = 0; i < (array1.length-1)/2; i++){
                System.out.print(array1[lowIndex] +" "+ array1[highIndex]+" ");
                lowIndex--;
                highIndex++;
            }
            System.out.print(array1[0]);
        }

    }
}
