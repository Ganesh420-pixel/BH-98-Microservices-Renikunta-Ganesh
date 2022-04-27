package concepts;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n=sc.nextInt(),c=0;
      sc.close();
      for(int i=1; i<=n;i++)
      {
      if(n%i==0)
      {
    	 c=c+1;
      }
      }
      if(c!=2)
      {
    	  System.out.println("It is not a prime number");
      }
      else
      {
    	  System.out.println("It is a Prime number");
      }
	}
}
