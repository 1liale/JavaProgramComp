package CCCPractice.Senior;

import java.util.Scanner;

public class CCC12S1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        System.out.println( (n*(n-1)*(n-2))/6);
    }
}
