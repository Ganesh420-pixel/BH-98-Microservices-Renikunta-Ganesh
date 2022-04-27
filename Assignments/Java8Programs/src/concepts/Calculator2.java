package concepts;
import java.util.Scanner;
 //POJO method
class Operations1
{
	int n1;
	int n2;
	Operations1(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
}
public class Calculator2 {

	public static int add(Operations1 op)
	{
		return op.n1+op.n2;
	}
	
	public  static int sub(Operations1 op)
	{
		return op.n1-op.n2;
	}
	
	public  static int mul(Operations1 op)
	{
		return op.n1*op.n2;
	}
	
	public  static double div(Operations1 op)
	{
		return op.n1/op.n2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter first number:");
int n1=s.nextInt();
System.out.println("Enter second number:");
int n2=s.nextInt();
Operations1 op=new Operations1(n1,n2);
System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
System.out.println("enter your operation number");
int o=s.nextInt();
switch(o)
{
case 1:	System.out.println("Addition Value is: "+add(op));
        break;
case 2:	System.out.println("Substracted Value is: "+sub(op));
        break;
case 3:	System.out.println("Multiplication Value is: "+mul(op));
        break;
case 4:	System.out.println("Addition Value is: "+div(op));
        break;
default: System.out.println("Invalid operation");
}
s.close();
	}

}
