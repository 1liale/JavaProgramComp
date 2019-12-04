package CCCPractice.Senior;

import java.util.Scanner;

public class CCC02S1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int[] tickets = new int[4];
        for(int i = 0; i < 4; i++)
        {
            tickets[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int testTotal = 0, min = Integer.MAX_VALUE, counter = 0;

        for(int i = 0; i <= sum; i++)
        {
            for(int j = 0; j <= sum; j++)
            {
                for(int k = 0; k <= sum; k++)
                {
                    for(int l = 0; l <= sum; l++)
                    {
                        if(tickets[0] * i + tickets[1] * j + tickets[2] * k + tickets[3] * l == sum)
                        {
                            if(testTotal < min) {
                                testTotal = i+j+k+l;
                                min = testTotal;
                            }
                            System.out.println("# of PINK is "+ i + " # of GREEN is "+j+" # of RED is "+k+" # of ORANGE is "+l);
                            counter++;
                        }
                    }
                }
            }
        }

        System.out.println("Total combinations is "+counter+".");
        System.out.println("Minimum number of tickets to print is "+min+".");
    }
}
