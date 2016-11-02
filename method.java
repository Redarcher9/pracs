import java.util.Scanner;
class method

{
static class Students
{
int roll_no;
String name;
}
public static void main(String arg[])
{
Scanner a = new Scanner(System.in);
Students[] x=new Students[3];
String z;
for(int i=0;i<3;i++)
{
x[i]= new Students();
}

for(int i=0;i<3;i++)
{
System.out.println("enter rollno");
x[i].roll_no=Integer.parseInt(a.next());
System.out.println("enter name");
x[i].name=a.next();
}

}
}


