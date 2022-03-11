import java.util.Scanner;
class Question17
{
public static void main(String [] args)
{
long n1,n2;
int i = 0, rem = 0;
int[] sum = new int[20];

Scanner in = new Scanner(System.in);
System.out.print("Input first binary number : ");
n1 = in.nextLong();

System.out.print("Input second binary number : ");
n2 = in.nextLong();

while (n1 != 0 || n2 !=0)
{
sum[i++] = (int)((n1%10+n2%10+rem)%2);
rem=(int)((n1%10+n2%10+rem)/2);

n1=n1/10;
n2=n2/10;
}

if(rem!=0)
{
sum[i++]=rem;
}
--i;

System.out.print("sum of two binary no is= : ");
while(i>=0)
{
System.out.print(sum[i--]);
}
System.out.println("");
}
}





