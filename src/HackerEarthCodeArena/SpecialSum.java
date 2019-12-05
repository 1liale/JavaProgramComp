package HackerEarthCodeArena;

import java.util.*;
import java.io.*;
import java.math.*;

class SpecialSum
{
    //private static int ret = 0;
    public static void main(String args[] ) throws Exception
    {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++)
        {
            long N = sc.nextLong();
            long output = specialSum(N);

            System.out.println(output);
        }
    }

    public static long specialSum(long N)
    {
        long ret = 0;
        for(long i = 1; i <= N; i++)
        {
            if(N % i == 0)
            {
                ret += foo(i);
            }
        }
        return ret;
    }

    public static long foo(long n)
    {
        int ret = 0;
        for(long i = 1; i<= n; i++)
        {
            if(gcd(n,i))
            {
                ret++;
            }
        }
        return ret;
    }

    public static boolean gcd(long a, long b)
    {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).equals(BigInteger.ONE);
    }
}

