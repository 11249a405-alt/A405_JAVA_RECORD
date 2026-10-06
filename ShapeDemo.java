import java.io.*; 
import java.util.*; 
interface Shape
{
final float pi=3.14f; 
float area(int r);
}
interface CylinderShape
{
final float pie=3.14f;
float volume(int r , int h);
}
class Cylinder implements CylinderShape
{
public float volume(int r, int h)
{
return(pie*r*r*h);
}
}
class Sphere implements Shape
{
public float area(int r)
{
return((4/3)*pi*r*r);
}
}
class ShapeDemo
{
public static void main(String arg[])
{
int r, h;
Scanner sc = new Scanner(System.in); 
System.out.print("Enter radius & height-"); 
r=sc.nextInt();
h=sc.nextInt();
Cylinder c1=new Cylinder(); 
Sphere s1=new Sphere();
System.out.println("Volume of Cylinder:"+c1.volume(r, h)); 
System.out.println("Area of Sphere:"+s1.area(r));
}
}
