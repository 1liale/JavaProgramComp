package CCCPractice.Senior;

import java.util.Scanner;

public class CCC02S3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] map = new int[r][c];

		// Stores input from user
		for(int i = 0; i< r; i++)
		{
			String curStr = sc.nextLine().replaceAll(" ","");
			for(int j = 0; j< c; j++)
			{
				if( curStr.charAt(j) == '.' )
					map[i][j] = 1;
				else
					map[i][j] = 0;
			}
		}


	}
}

//	2
//	4
//	....
//	.XX.
//	3
//	F
//	R
//	F