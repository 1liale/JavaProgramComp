package CCCPractice.Senior;

import java.util.Scanner;

public class CCC14S2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[][] names = new String[2][N];
		for(int i = 0; i< 2; i++)
		{
			String[] temp = sc.nextLine().split(" ");
			for(int j = 0; j< N; j++) {
				names[i][j] = temp[j];
			}
		}

		int counter = 0;
		for(int i = 0; i < N; i++)
		{
			String name1 = names[0][i];
			String name2 = names[1][i];
			if(name1.equals(name2)) {
				System.out.println("bad");
				return;
			}
			else{
				int partnerIndex = 0;
				for(int j = i; j < N; j++)
				{
					if(names[0][j].equals(name2))
					{
						partnerIndex = j;
						break;
					}
				}
				if(names[1][partnerIndex].equals(name1))
				{
					counter++;
					continue;
				}
			}
		}
		if(counter-1 == N/2)
			System.out.println("good");
		else
			System.out.println("bad");
	}
}
