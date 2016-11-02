import java.util.Scanner;
class area
{
void area(int a)
{
System.out.println("area of circle is");
System.out.println(3.14*a*a);
}
void area(int a,int b)
{
System.out.println("area of square is");
System.out.println(a*b);
}

public static void main(String arg[])
{
area x=new area();
x.area(10);
x.area(100,50);
}
}
