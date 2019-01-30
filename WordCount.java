import java.io.*;
import java.util.*;
public class WordCount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a sentence");
String str=s.nextLine();
String[] word=str.split("\\s");
int n=word.length;
System.out.println(n+"words");
}
}
