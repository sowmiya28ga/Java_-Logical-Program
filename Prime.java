import java.io.*;
class Prime{
public static void main(String args[])throws Exception
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Prime Number Checking");
System.out.println("_________________________________________");
System.out.println("Enter The Number:");
String s1 = br.readLine();
int n = Integer.parseInt(s1);
System.out.println("Report");
int count = 0;
for(int i = 2;i<=n-1;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("The Number Of "+n+" is a Prime");
}
else
{
System.out.println("The Number Of "+n+" is not a Prime");
}
}
}
