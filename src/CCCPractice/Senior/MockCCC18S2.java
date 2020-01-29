package CCCPractice.Senior;

import java.util.Scanner;

public class MockCCC18S2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] nums = new int[a];
		for(int i = 0; i< nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}

		int counter = 0;
		while(true)
		{
			boolean isSwap = false;
			for(int i = 1; i< a; i++)
			{
				if(nums[i-1] < nums[i]) {
					int temp = nums[i-1];
					nums[i-1] = nums[i];
					nums[i] = temp;
					counter++;
					isSwap = true;
				}
			}
			if(isSwap == false)
			{
				break;
			}
		}
		System.out.println(counter);
	}
}
