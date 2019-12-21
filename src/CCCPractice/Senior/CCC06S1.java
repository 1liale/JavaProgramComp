package CCCPractice.Senior;

import java.util.Scanner;

public class CCC06S1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String mother = sc.nextLine();
        String father = sc.nextLine();
        String[] mGenes = new String[5];
        String[] fGenes = new String[5];
        for(int i = 0; i< 5; i++)
        {
            mGenes[i] = mother.substring(i * 2, (i+1)*2);
            fGenes[i] = father.substring(i * 2, (i+1)*2);
        }

        int N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++)
        {
            int counter = 0;
            String curString = sc.nextLine();
            for (int j = 0; j < 5; j++) {
                char tmpChar = ' ';
                boolean condition = false;
                for(int a = 0; a < 2; a++)
                {
                    if(condition)
                    {
                        condition = false;
                        break;
                    }
                    for(int b = 0; b < 2; b++)
                    {
                        tmpChar = (char)Math.min(mGenes[j].charAt(a),fGenes[j].charAt(b));

                        if(tmpChar == curString.charAt(j))
                        {
                            counter++;
                            condition = true;
                            break;
                        }
                    }
                }
            }

            if (counter == 5) {
                System.out.println("Possible baby.");
            } else {
                System.out.println("Not their baby!");
            }
        }
    }
}
