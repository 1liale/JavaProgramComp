package CCCPractice;

import java.util.Scanner;

public class WhenInRome
{
    private static char[] roman = {'I','V','X','L','C','D','M'};
    private static int[] values ={1,5,10,50,100,500,1000};

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for(int i = 0; i< input; i++)
        {
            String a = sc.nextLine();
            System.out.println(a);

            int counter = 0, sum = 0, index = 0;
            for(char c : a.toCharArray())
            {
                if(c == 'M' || c == 'C' ||c == 'X' || c == 'I')
                {
                    if(index > 0 && a.charAt(index-1) != c)
                    {
                        counter = 0;
                    }
                    counter++;
                    if(counter<=3)
                        sum += find(c);
                    else if(counter > 3)
                    {
                        System.out.print(" CONCORDIA CUM VERITATE");
                    }
                }
                else{
                    if(counter == 1 || counter == 2)
                    {
                        sum += (find(c) - 2 * counter * find(a.charAt(index-1)));
                    }
                    else
                        sum += find(c);
                    counter = 0;
                }
                index++;
            }
            System.out.println(sum);
        }
    }

    public static int find(char c)
    {
        for(int j = 0; j < roman.length; j++)
        {
            if(c == roman[j])
            {
                return values[j];
            }
        }
        return 0;
    }
}
