package CCCPractice.Senior;

import java.util.Arrays;
import java.util.Scanner;

public class MockCCC18J4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] array1 = new int[N][N];
		int[] array2 = new int[N];
		for(int i = 0; i< array1.length; i++)
		{
			for(int j = 0; j< array1.length; j++)
			{
				array1[i][j] = sc.nextInt();
			}
			Arrays.sort(array1[i]);
		}

		for(int i = 0; i< N; i++)
		{
			Arrays.sort(array1[i]);
			array2[i] = array1[i][N/2];
		}

		Arrays.sort(array2);
		System.out.println(array2[N/2]);

	}
}
