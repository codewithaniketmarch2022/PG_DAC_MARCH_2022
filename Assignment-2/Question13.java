import java.util.Scanner;

class Question13
{
   public static void main(String args [])
   {
   float  width,height,area,perimeter;

   Scanner in = new Scanner(System.in);

   System.out.println("Enter a width of rectangle");
   width = in.nextFloat();


   System.out.println("Enter a height of rectangle");
   height = in.nextFloat();

   area = width * height;
   perimeter = 2 * (width + height);

   System.out.println(area);
   System.out.println(perimeter);

   }
}

