import java.io.*;
import java.util.*;
public class Wordcount
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
String str;
System.out.println("Enter a String");
str=s.nextLine();
for(int i=0;i<str.length();i++)
{
if(str.indexOf(" ")==-1)
{
count++;
}
}
System.out.println("The number of words are"+count);
}
}
