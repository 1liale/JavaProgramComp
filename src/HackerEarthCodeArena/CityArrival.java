package HackerEarthCodeArena;

import java.util.*;
import java.io.*;

class CityArrival
{
    public static void main(String args[] ) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i< a; i++)
        {
            long n = Long.parseLong(br.readLine());
            long lo = 0;
            long hi = 2000000000;
            while(lo < hi)
            {
                long mid = (lo + hi) >> 1;
                long temp = mid * (mid + 1) / 2;
                if(temp >= n)
                {
                    hi = mid;
                }
                else
                {
                    lo = mid + 1;
                }
            }
            System.out.println(lo);
        }
    }
}
