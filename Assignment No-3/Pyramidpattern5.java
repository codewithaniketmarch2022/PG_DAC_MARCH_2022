import java.util.Scanner;
class Pyramidpattern5
{
public static void main(String []args)
{
for(int j = 9; j>=1; j--)
{
for(int i = 1;i<=j; i++)
{
System.out.print("  ");
}
for(int i = j;i<=9;i++)
{
System.out.print(i+" ");
}
for(int k = 8;k>=j;k--)
{
System.out.print(k+" ");
}
System.out.println("");
}
}
}





