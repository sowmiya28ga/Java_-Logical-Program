import java.io.*;

class taksha
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Takshashila University");
        System.out.println("Ongur, Tindivanam");
        System.out.println("------------------------------");
        System.out.println("Student Mark List");
        System.out.println("------------------------------");

        System.out.println("Enter Enrollment Number:");
        String s1 = br.readLine();

        System.out.println("Enter Student Name:");
        String s2 = br.readLine();

        System.out.println("Enter JAVA Mark:");
        int m1 = Integer.parseInt(br.readLine());

        System.out.println("Enter OS Mark:");
        int m2 = Integer.parseInt(br.readLine());

        System.out.println("Enter CWS Mark:");
        int m3 = Integer.parseInt(br.readLine());

        int tot = m1 + m2 + m3;
        double avg = tot / 3.0;

        System.out.println("Total Mark: " + tot);
        System.out.println("Average Mark: " + avg);
        System.out.println("-------------------------------");
    }
}