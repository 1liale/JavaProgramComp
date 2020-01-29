package CCCPractice.Senior;

import java.util.*;

public class CCC12S3 {
	public static void main(String[] args) {
		int[] mode = new int[1005];
		int[] mode1 = new int[1005];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int curInt = sc.nextInt();
			mode[curInt]++;
			mode1[curInt]++;
		}

		Arrays.sort(mode);
		int first = mode[mode.length - 1];
		int second = mode[mode.length - 2];

		if (first == second) {
			LinkedList<Integer> l1 = new LinkedList<Integer>();
			for (int i = 0; i < 1005; i++) {
				if (mode1[i] == first) {
					l1.add(i);
				}
			}

			System.out.println(l1.get(l1.size() - 1) - l1.get(0));
		} else {
		    int l1 = 0;
            LinkedList<Integer> l2 = new LinkedList<>();
            for (int i = 0; i < 1005; i++) {
                if (mode1[i] == first) {
                    l1 = i;
                }
                else if(mode1[i] == second)
                {
                    l2.add(i);
                }
            }

            int result1 = Math.abs(l1 - l2.get(0));
            int result2 = Math.abs(l1 - l2.get(l2.size()-1));

            System.out.println(Math.max(result1,result2));
		}
	}
}
