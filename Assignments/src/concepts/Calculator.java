package concepts;
import java.util.Scanner;
 
class Operations
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	
	public int sub(int n1, int n2)
	{
		return n1-n2;
	}
	
	public int mul(int n1, int n2)
	{
		return n1*n2;
	}
	
	public double div(int n1, int n2)
	{
		return n1/n2;
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Operations op=new Operations();
System.out.println("Enter first number:");
int n1=s.nextInt();
System.out.println("Enter second number:");
int n2=s.nextInt();
System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
System.out.println("enter your operation number");
int o=s.nextInt();
switch(o)
{
case 1:	System.out.println("Addition Value is: "+op.add(n1, n2));
        break;
case 2:	System.out.println("Substracted Value is: "+op.sub(n1, n2));
        break;
case 3:	System.out.println("Multiplication Value is: "+op.mul(n1, n2));
        break;
case 4:	System.out.println("Addition Value is: "+op.div(n1, n2));
        break;
default: System.out.println("Invalid operation");
}
s.close();
	}

}
