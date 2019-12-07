package HackerEarthCodeArena;

import java.util.Scanner;

public class PrimeString
{
    public static void main(String[]args)
    {
        int max = 100001;
        boolean[] array1 = new boolean[max];
        array1[0] = true;
        for(int i = 2; i<max; i++)
        {
            array1[i] = true;
        }

        sieve(array1,max);

        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i = 0; i< test; i++)
        {
            String str = sc.nextLine();
            int[] map = new int[26];
            for(int j = 0; j < str.length(); j++)
            {
                map[str.charAt(j)-'a']++;
            }

            String ans = "YES";
            int noOfDistinctAlpha = 0;
            for(int j = 0; j < 26; j++)
            {
                if(!array1[map[j]])
                {
                    ans = "NO";
                }

                if(map[j] != 0)
                {
                    noOfDistinctAlpha++;
                }
            }

            if(!array1[noOfDistinctAlpha])
            {
                ans = "NO";
            }
            System.out.println(ans);
        }
    }

    public static boolean[] sieve(boolean[] arr, int length)
    {
        for(int i = 2; i * i< length; i++)
        {
            if(arr[i])
            {
                for (int j = i+i; j < length; j+= i)
                {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
}
