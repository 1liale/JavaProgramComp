package CCCPractice.Senior;

import java.util.Scanner;

public class CCC16S5
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.nextLine().split(" ");
		int N = Integer.parseInt(str1[0]);
		long T = Integer.parseInt(str1[1]);
		String circle = sc.nextLine();
		String str = Long.toBinaryString(T);

		int counter = 1;
		for(int i = str.length()-1; i >= 0; i--)
		{
			char c = str.charAt(i);
			if(c == '1')
			{
				String S1 = shiftLeft(circle, counter);
				String S2 = shiftRight(circle, counter);
				circle = findXOR(S1, S2);
				counter *= 2;
			}
		}

		System.out.println(circle);
	}
	public static String shiftLeft(String S, int i)
	{
		return S.substring(i) + S.substring(0,i);
	}
	public static String shiftRight(String S, int i)
	{
		return S.substring(S.length()-i) + S.substring(0,S.length()-i);
	}

	public static String findXOR(String S1, String S2)
	{
		String S = "";
		for(int i = 0; i <  S1.length(); i++) {
			if (S1.charAt(i) == S2.charAt(i)) {
				S += '0';
			}
			else {
				S+='1';
			}
		}
		return S;
	}
}
