package CCCPractice.Senior;

import java.util.Arrays;
import java.util.Scanner;

public class MockCCC18J3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		int array1[] = new int[a];
		int counter = 0;
		for(int i =0; i< a; i++) {
			array1[i] = sc.nextInt();
		}
		for(int i =0; i< a; i++)
		{
			for(int j = i+1; j< a; j++)
			{
				for(int k = j+1; k < a; k++)
				{
					int array2[] = {array1[i],array1[j],array1[k]};
					Arrays.sort(array2);
					if(array2[1] == x)
					{
						counter ++;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
