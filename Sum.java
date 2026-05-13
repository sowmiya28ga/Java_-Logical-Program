import java.io.*;

class Sum
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Sum Of N Numbers");
        System.out.println("--------------------------------");
        System.out.println("Enter the Number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        System.out.println("Report:");

        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
            System.out.print("+" + i);
        }

        System.out.println("=" + sum);
    }
}
 
