import java.util.*;

class Digit
{
 public static void main(String args[]) {

Scanner s = new Scanner(System.in);

int count=0;



int number = s.nextInt();

while(number!=0)

{number=number/10;

count++;
}

System.out.println( count);


}
}
