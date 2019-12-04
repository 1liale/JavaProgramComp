package CCCPractice;

public class Exam12
{
    public static void main(String[]args)
    {
        String S = "ABCDEFG";


        String output = "";
        for(int i = 'A'; i < 'A'+7; i++) {
            int a = S.charAt(0) + 3;
            output += (char) i;
        }
        System.out.println(output);
    }
}
