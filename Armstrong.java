import java.io.*;
class Armstrong
{
public static void main(String args[])throws Exception
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Armstrong Number:");
System.out.println("------------------------");
System.out.println("Enter a Number:");
String s1 = br.readLine();
int num = Integer.parseInt(s1);
int original = num;
int sum = 0;
while(num > 0)
{
int digit = num % 10;
sum = sum + (digit*digit*digit);
num = num / 10;
}
if(sum == original)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}
}