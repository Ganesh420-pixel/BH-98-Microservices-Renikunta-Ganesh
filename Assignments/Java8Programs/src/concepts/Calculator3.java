package concepts;
import java.util.Scanner;
 //oop method
class Operations2
{
	 private int n1;
	private int n2;
	Operations2(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
}
public class Calculator3 {

	public static int add(Operations2 op)
	{
		return op.getN1()+op.getN2();
	}
	
	public  static int sub(Operations2 op)
	{
		return op.getN1()-op.getN2();
	}
	
	public  static int mul(Operations2 op)
	{
		return op.getN1()*op.getN2();
	}
	
	public  static double div(Operations2 op)
	{
		return op.getN1()/op.getN2();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter first number:");
int n1=s.nextInt();
System.out.println("Enter second number:");
int n2=s.nextInt();
Operations2 op=new Operations2(n1,n2);
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
