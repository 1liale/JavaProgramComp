package DataStructures.StacksQueues;

import java.util.Scanner;
import java.util.Stack;

public class StackPracticeMedium {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int count = 0, max =0;
		for(int i = 0; i< N; i++)
		{
			int n = sc.nextInt();
			if(!stack.isEmpty() && n <=0 && stack.peek() == -n)
			{
				stack.pop();
				count += 2;
			}
			else if(!stack.isEmpty() && (n<=0 || stack.peek() != -n)){
				stack.push(n);
				if(max < count)
				{
					max = count;
					count = 0;
				}
			}else{
				stack.push(n);
			}

			if(max < count)
			{
				max = count;
				System.out.println(max);
			}
		}
	}
}
