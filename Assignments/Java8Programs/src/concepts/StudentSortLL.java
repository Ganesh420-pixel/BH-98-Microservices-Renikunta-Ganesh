package concepts;
import java.util.*;

public class StudentSortLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(3,"a");
Student s2=new Student(1,"b");
Student s3=new Student(2,"c");

List<Student> myList=new LinkedList<Student>();
     myList.add(s1);
     myList.add(s2);
     myList.add(s3);
    
   //  System.out.println(myList);
     Collections.sort(myList);
     Iterator itr=myList.iterator(); 
     
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     
	}

	

}
