import java.util.Scanner;
class LargestOfThreeNumbers
{
public static void main(String args[])
{
int x, y, z;
System.out.println("Enter three integers"); 
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
if (x > y && x > z)
System.out.println("First number islargest."); 
else if (y > x && y > z)
System.out.println("Second number islargest."); 
else if (z > x && z > y)
System.out.println("Third number islargest."); 
else
System.out.println("The numbers are not distinct.");
}
}
