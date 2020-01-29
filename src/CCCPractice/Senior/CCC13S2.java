package CCCPractice.Senior;

import java.util.Scanner;

public class CCC13S2 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int terms  = sc.nextInt();
		int[] carts = new int[terms];
		for(int i = 0; i < terms; i++)
		{
			carts[i] = sc.nextInt();
		}
		int sum = 0;

		for(int i = 0; i< carts.length; i++)
		{
			if(i < 4)
			{
				sum += carts[i];
			}
			else {
				sum += carts[i] - carts[i-4];
			}

			if(sum > max)
			{
				System.out.println(i);
				return;
			}
		}

		System.out.println(terms);
	}
}
