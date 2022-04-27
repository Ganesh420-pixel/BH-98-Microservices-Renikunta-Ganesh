package concepts;

import java.util.Scanner;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("***************MENU***************");
     System.out.println("\nOrderId      Item                    Price");
     System.out.println("1        Chicken Pizza---------------200/-\n2       Veg Pizza---------------------150/-\n3       Paneer Pizza-----------------180/-");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Order Id Please...!!!");
     int order=sc.nextInt();
     System.out.println("Enter your Quantity");
     int quantity=sc.nextInt();
     sc.close();
     switch(order)
     {
     case 1: System.out.println("Thank you for Ordering chicken pizza...");
             System.out.println("Your Bill For "+quantity+" pizzas is: "+(quantity*200));
             break;
     case 2: System.out.println("Thank you for Ordering veg pizza...");
             System.out.println("Your Bill For "+quantity+" pizzas is: "+(quantity*150));
             break;
     case 3: System.out.println("Thank you for Ordering paneer pizza...");
             System.out.println("Your Bill For "+quantity+" pizzas is: "+(quantity*180));
             break;
     default: System.out.println("Invalid order");
     }
	}

}
