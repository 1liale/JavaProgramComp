package CCCPractice;

import java.util.Scanner;

public class Groups
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int input = -1;
        while((input = sc.nextInt()) != 0)
        {
            // Stores input map into 2d array
            int[][] map = new int[input][input];
            for(int i = 0; i< input; i++)
            {
                for(int j = 0; j < input; j++)
                {
                    map[i][j] = sc.nextInt();
                }
            }


        }
    }
}
