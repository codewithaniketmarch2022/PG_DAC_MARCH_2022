import java.util.Scanner;
class Pyramid6
{
public static void main(String args [])
{
for(int i=1;i<=9;i++)
  {
  for(int j=1;j<=i;j++)
  {
  System.out.print(" ");
  }
  for(int k=15;k>(i*2);k--)
  {
  System.out.print("*");
  }
  System.out.println();
  }
} 
}