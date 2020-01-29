package CCCPractice.Senior;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC07S3 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int[] map1 = new int[10000];
        int[] checker = new int[a];
        int x, y;

		for(int i = 0; i < a; i++)
		{
			x = sc.nextInt();
			y = sc.nextInt();
			map1[x] = y;
		}

		x = sc.nextInt();
		y = sc.nextInt();
		boolean[] visited = new boolean[10000];
		while(x != 0&& y != 0)
		{
			for(int i=0;i<10000;i++) {
				visited[i] = false;
			}
			int dist = -1;
			while(!visited[x] && x != y) {
				visited[x] = true;
				dist++;
				x = map1[x];
			}
			if(x==y) {
				System.out.println("Yes	"+dist);
			}
			else {
				System.out.println("No");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
}