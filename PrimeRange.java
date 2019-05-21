import java.util.*;
 
 public class PrimeRange
{
 public static void main(String args[]) {
 
int a,b,i;
 
Scanner s = new Scanner(System.in);
 
a=s.nextInt();
 
b=s.nextInt();
 
while (a < b) {
            boolean flag = false;
 
            for( i = 2; i <= a/2; ++i) {
 
                if(a % i == 0) {
                    flag = true;
                    break;
                }
            }
 
            if (!flag)
                System.out.print(a + " ");
 
            ++a;
        }
}
}
