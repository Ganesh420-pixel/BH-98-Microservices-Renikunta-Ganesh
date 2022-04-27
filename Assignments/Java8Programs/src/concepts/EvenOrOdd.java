package concepts;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n=sc.nextInt();
      sc.close();
      if(n%2==0)
      {
    	  System.out.println("It is Even number");
      }
      else
      {
    	  System.out.println("It is Odd number");
      }
	}

}
