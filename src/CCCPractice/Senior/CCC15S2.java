package CCCPractice.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC15S2
{

	public static void main(String[]args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int J = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		char[] jerseySizes = new char[J];
		for(int i = 0; i < J; i++)
		{
			jerseySizes[i] = br.readLine().charAt(0);
		}

		int counter = 0;
		boolean chosen[] = new boolean[J];
		for(int i = 0; i < P; i++ )
		{
			String temp[] = br.readLine().split(" ");
			char a = temp[0].charAt(0);
			int b = Integer.parseInt(temp[1]);
			for(int j = 0; j < J; j++) {
				if (b == j + 1 && jerseySizes[j] <= a && chosen[j] == false) {
					chosen[j] = true;
					counter++;
					break;
				}
			}


		}
		System.out.println(counter);
	}
}
