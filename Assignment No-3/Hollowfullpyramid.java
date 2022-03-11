import java.util.Scanner;
class Hollowfullpyramid
{
public static void main(String []args)
{
for(int j = 1; j<=5;j++)
{
for(int i = 4; i>=j;i--)
{
System.out.print(" ");
}
for(int i=1;i<=2*j-1;i++)
{
if(i==1 || i==2*j-1 || j==5 && i%2!=0)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}



