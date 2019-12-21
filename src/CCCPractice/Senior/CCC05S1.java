package CCCPractice.Senior;

import java.util.Scanner;

public class CCC05S1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i< N; i++)
        {
            String temp = "";
            String str = sc.nextLine().replaceAll("-","");
            if(str.length() > 10)
                str = str.substring(0,10);
            for(char cur : str.toCharArray())
            {
                if(cur >= 'A') {
                    if (cur <= 'C') {
                        temp += '2';
                    }
                    else if (cur <= 'F') {
                        temp += '3';

                    }
                    else if (cur <= 'I') {
                        temp += '4';
                    }
                    else if(cur <= 'L') {
                        temp += '5';
                    }
                    else if(cur <= 'O') {
                        temp += '6';
                    }
                    else if(cur <= 'S') {
                        temp += '7';
                    }
                    else if(cur <= 'V')
                    {
                        temp += '8';
                    }
                    else if(cur <= 'Z')
                    {
                        temp += '9';
                    }
                }
                else
                    temp += cur;
            }
            System.out.println(temp.substring(0,3)+"-"+temp.substring(3,6)+"-"+temp.substring(6));
        }
    }
}