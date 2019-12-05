package HackerEarthCodeArena;

import java.util.*;

class CompilerConverter
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String input = null;
        while(sc.hasNextLine())
        {
            input = sc.nextLine();
            for(int i = 0; i < input.length() - 1; i++)
            {
                if(input.substring(i,i+2).equals("//"))
                {
                    break;
                }

                else if(input.substring(i,i+2).equals("->"))
                {
                    StringBuilder myName = new StringBuilder(input);
                    myName.setCharAt(i,'.');
                    myName.deleteCharAt(i+1);
                    input = myName.toString();
                }
            }
            System.out.println(input);
        }

    }
}
