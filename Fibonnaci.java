import java.io.*;
import java.util.*;
public class Fibonnaci
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1=0,n2=1;
System.out.println("Enter a number");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
int n3=n1+n2;
n3=n2;
n2=n1;
System.out.println(n3);
}
}
}
