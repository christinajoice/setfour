import java.io.*;
import java.util.*;
public class Charcount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str;
System.out.println("Enter a sentence");
str=s.nextLine();
str=str.replaceAll("\\s","");
System.out.println("The count characters are"+str.length());
}
}
