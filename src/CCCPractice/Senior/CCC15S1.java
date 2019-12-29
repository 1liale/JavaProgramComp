package CCCPractice.Senior;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC15S1 {
    private static ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++ ) {
            int a = sc.nextInt();
            if (a != 0) {
                nums.add(a);
            } else {
                nums.remove(nums.size()-1);
            }
        }
        int sum = 0;
        for(Integer cur : nums)
        {
            sum += cur;
        }

        System.out.println(sum);
    }
}
