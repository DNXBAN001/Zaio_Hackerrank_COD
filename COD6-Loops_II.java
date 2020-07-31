import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int term = 0;
        String sequence = "";
        for(int i = 0; i < t; i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            term = a + (int)(Math.pow(2, 0))*b;
            for(int j = 1; j <= n; j++)
            {
                sequence += term + " ";
                term += (int)(Math.pow(2, j))*b;
            }
            System.out.println(sequence);
            term = 0;
            sequence = "";
        }
        input.close();
    }
}
