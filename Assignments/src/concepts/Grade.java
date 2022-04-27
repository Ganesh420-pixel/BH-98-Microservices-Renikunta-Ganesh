package concepts;
import java.util.Scanner;
 class Student implements Comparable<Student>
 {
	 private int rollno;
	 private String name="";
	 
	 Student(int rollno, String name){
		 this.rollno=rollno;
		 this.name=name;
	 }
	
	  
	 public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

    @Override
	public int compareTo(Student comparestu)
	    {
	        int compareRollNo = comparestu.getRollno();
	        return this.getRollno() - compareRollNo;
	    }

	 
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	 @Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + "]";
		}

	public void S_marks(int marks) 
	{
		if(marks>=90 && marks<=100)
		{
			System.out.println("A GRADE");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("B GRADE");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("C GRADE");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
 }
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter marks: ");
   int marks=sc.nextInt();
   Student s=new Student();
   s.S_marks(marks);
   sc.close();
   
   
	}

}
