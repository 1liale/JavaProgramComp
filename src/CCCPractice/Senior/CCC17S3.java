package CCCPractice.Senior;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CCC17S3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array1[] = new int[N];
		Integer array2[] = new Integer[1005];

		for(int i = 0; i< array1.length; i++)
		{
			array1[i] = sc.nextInt();
		}

		int counter = 0;
		for(int i = 0; i< N-1; i++)
		{
			for(int j = i+1; j< N; j++)
			{
				array2[counter] = array1[i] + array1[j];
				counter++;
			}
		}
		System.out.println(areDistinct(array2) + " "+counter);

		int numDistinct = areDistinct(array2);
		if(numDistinct > counter)
			System.out.println(1 +" "+ counter);
		else {
			int curCounter = 0;
			int itr = counter;
			counter = 0;
			for(int i = 0; i< itr; i++)
			{
				if(array2[i] == 0)
				{
					break;
				}
				else {
					for (int k = 0; k < N - 1; k++) {
						for (int j = k + 1; j < N; j++) {
							if(array1[k] + array1[j] == array2[i])
							{
								curCounter++;
							}
						}
					}

					if(curCounter > counter)
					{
						counter = curCounter;
						curCounter = 0;
					}
				}
			}
			System.out.println(counter);
		}
	}
	public static int areDistinct(Integer arr[])
	{
		Set<Integer> s =
			new HashSet<Integer>(Arrays.asList(arr));
		// returns size of unique elements in the array
		return s.size();
	}

}
