package CCCPractice.Senior;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
//
//	3 3
//	1 2
//	2 1
//	2 3
public class MockCCC18S3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[][] map = new boolean[N][N];
		int[][] map1 = new int[M][2];

		for (int i = 0; i < M; i++) {
			int bv = sc.nextInt()-1;
			int ev = sc.nextInt()-1;

			map1[i][0] = bv;
			map1[i][1] = ev;
			map[bv][ev] = true;
		}

		for (int i = 0; i < M; i++)
		{
			map[map1[i][0]][map1[i][1]] = false;
			int[] step = new int[N];
			Arrays.fill(step, Integer.MAX_VALUE);
			LinkedList<Integer> queue = new LinkedList<>();

			queue.add(0);
			step[0] = 0;

			while (!queue.isEmpty()) {
				int a = queue.poll();

				for (int j = 0; j< N; j++)
				{
					if (map[a][j] == true && step[j] > step[a] + 1) {
						step[j] = step[a] + 1;
						queue.add(j);
					}
				}
			}
			if(step[N-1] == Integer.MAX_VALUE)
				System.out.println("NO");
			else
				System.out.println("YES");
			map[map1[i][0]][map1[i][1]] = true;
		}
	}
}
