package DataStructures.StacksQueues;

import java.util.LinkedList;
import java.util.Scanner;

public class MicroAndQueue
{
	private static LinkedList<Integer> queue = new LinkedList<>();
	public static void main(String args[] ) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < N; i++)
		{
			String[] temp = sc.nextLine().split(" ");
			if(temp.length == 2)
			{
				addQueue(temp[0].charAt(0), Integer.parseInt(temp[1]));
			}
			else
			{
				popQueue(temp[0].charAt(0));
			}
		}
	}

	public static void addQueue(char c, int num)
	{
		queue.add(num);
		System.out.println(queue.size());
	}

	public static void popQueue(char c)
	{
		int a;
		try
		{
			a = queue.pop();
		}
		catch(Exception ie)
		{
			a = -1;
		}
		System.out.println(a + " "+ queue.size());
	}
}
