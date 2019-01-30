import java.io.*;
import java.util.*;
public class SpaceCount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str;
System.out.println("Enter a String");
str=s.nextLine();
String[] word=str.split("\\s");
  int n=word.length-1;
  System.out.println(n+" spaces");
}
}
