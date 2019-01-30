import java.io.*;
import java.util.*;
public class Max10
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
System.out.println("Enter 10 numbers");
for(int i=0;i<10;i++)
{
a[i]=s.nextInt(i);
}
int max=Collections.max(Arrays.asList(a));
System.out.println("the maximum number is"+max);
}
}
