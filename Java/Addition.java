//Write a program to add two numbers, where numbers is to be accepted using 
// ii) DataInputStream 
import java.io.DataInputStream;

public class Addition
{
    public static void main(String args[])
    {
        String y;
        int a,b,z;
        try
        {
            DataInputStream ag=new DataInputStream(System.in);
            System.out.println("enter no a:");
            y= ag.readLine();
            a=Integer.parseInt(y);
            System.out.println("enter no b:");
            b=Integer.parseInt(ag.readLine());
            z=a+b;
            System.out.println("the sum is=" +z);


        }
        catch (Exception e){
            System.out.println("exception occurs!!!!!");
        }
    }
}