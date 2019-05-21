import java.util.*;
import java.lang.*;
import java.io.*;
 
 
 class Vowel
{
public static void main(String []args)
{
char ch;
Scanner obj=new Scanner(System.in);
 
ch=obj.next().charAt(0);
 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("Vowel");
else
            System.out.println("Consonant");
 
}
}
