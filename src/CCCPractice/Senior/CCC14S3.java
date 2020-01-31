package CCCPractice.Senior;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CCC14S3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> mountain = new Stack<>();
		Stack<Integer> branch = new Stack<>();

		int N = sc.nextInt();
		for(int i  = 0; i< N; i++) {
			int car = 1;
			int size = sc.nextInt();
			for(int j = 0; j < size; j++) {
				mountain.push(sc.nextInt());
			}
			while (car <= size) {
				if (!mountain.isEmpty() && mountain.peek() == car) {
					mountain.pop();
					car++;
				}
				else if (!branch.isEmpty() && branch.peek() == car)
				{
					branch.pop();
					car++;
				}
				else if(!mountain.isEmpty())
				{
					branch.push(mountain.peek());
					mountain.pop();
				}
				else {
					System.out.println("N");
					break;
				}
			}

			if(car == size+1)
			{
				System.out.println("Y");
			}
		}
	}
}
