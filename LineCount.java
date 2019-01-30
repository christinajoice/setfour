import java.io.*;
import java.util.*;
public class LineCount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String str=s.nextLine();
String[] word=str.split("\\.");
int n=word.length;
System.out.println(n+"Lines");
}
}
