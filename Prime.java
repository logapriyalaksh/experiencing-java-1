import java.util.*;
 
class Prime
{
 public static void main(String args[]) {
 
Scanner s = new Scanner(System.in);
 
int i;
int flag=0;
 
int number = s.nextInt();
 
for(i=2;i<number;i++)
 
{
 
if(number%i==0)
{
flag=1;
break;
 
}
}
if(flag==1)
{
 
System.out.println( "no");
 
}
else
{
System.out.println("yes");
 
}
 
}
}
