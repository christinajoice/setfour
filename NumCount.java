import java.io.*;
import java.util.*;
public class NumCount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
ArrayList a=new ArrayList();
System.out.println("Enter a string");
String str=s.nextLine();
for(char c:str.toCharArray())
{
if(Character.isDigit(c))
a.add(c);
}
long n=a.stream().count();
System.out.println(n+"numbers");
}
}
