package CCCPractice.Senior;

import java.util.Scanner;

public class CCC09S1
{
    private static int squares[] = new int[100000005];
    private static int cubes[] = new int[100000005];

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int counter = 0;
        for(int i = (int)Math.sqrt(a); i< (int)Math.sqrt(b) + 1; i++)
        {

            for(int j = (int)Math.sqrt(a); j< (int)Math.cbrt(b) + 1; j++)
            {

                if(squares[i] == cubes[j])
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
