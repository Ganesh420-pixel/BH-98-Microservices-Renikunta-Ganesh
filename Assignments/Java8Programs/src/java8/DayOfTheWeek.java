package java8;

import java.time.LocalDate;
import java.util.Scanner;
//import java.time.LocalDateTime;

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc=new Scanner(System.in);
		LocalDate date = LocalDate.now();
		System.out.println("Enter a number to add");
		int n =sc.nextInt();
		sc.close();
		date= date.plusDays(n);
		System.out.println(date.getDayOfWeek());*/
		
		 System.out.println("Ente a Number");
	        Scanner sc = new Scanner(System.in);
	        String day = sc.next();
	        LocalDate date = LocalDate.of(Integer.parseInt(day), 1, 1);
	        System.out.println(date);
	        System.out.println(date.getDayOfWeek());
	        System.out.println("Enter number of days you want to add ");
	        date = date.plusDays(sc.nextLong());
	        sc.close();
	        System.out.println(date.getYear());
	        System.out.println(date);
	}

}
