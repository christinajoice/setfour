import java.io.*;
import java.util.*;
public class Bitwise
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
int n1=s.nextInt();
int n2=s.nextInt();
n1=n1^n2;
n2=n1^n2;
n1=n1^n2;
System.out.println(n1+" "+n2);
}
}
