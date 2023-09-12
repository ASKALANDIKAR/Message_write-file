import java.io.*;
import java.util.*;
class writeFile
{
public static void main(String args[]) throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter File Name = ");
String f1=sc.nextLine();
System.out.print("Enter Data = ");
String data=sc.nextLine();
FileOutputStream fout=new FileOutputStream(f1);

for(int i=0;i<data.length();i++)
{
char ch= data.charAt(i);
fout.write(ch);
}
fout.close();
}
}