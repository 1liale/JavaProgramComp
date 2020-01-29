package CCCPractice.Senior;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class CCC11S3 {
	private static int scan(int m, int x){
		if (m == 0){
			return 0;
		}else{

			int blockW = (int) Math.pow(5,m-1);
			int region = x / blockW;
			if(region == 0 || region == 4) {
				return 0;
			}
			else if(region == 1 || region == 3){
				return blockW + scan(m-1, x - blockW * region);
			}
			else {
			 	return 2 * blockW + scan(m-1, x - blockW * region);
			}

		}
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int iter = input.nextInt();
		for (int i = 0; i < iter; i++){
			int m = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			int output = scan(m, x);
			if(y < output)
			{
				System.out.println("crystal");
			}
			else {
				System.out.println("empty");
			}
		}
	}
}