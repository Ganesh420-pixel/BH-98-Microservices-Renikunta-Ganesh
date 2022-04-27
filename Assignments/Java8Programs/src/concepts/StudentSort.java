package concepts;
import java.util.*;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(3,"a");
Student s2=new Student(1,"b");
Student s3=new Student(2,"c");
Student s[]= {s1,s2,s3};
TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>();
for(int i=0;i<s.length;i++)
{
	tree_map.put(s[i].getRollno(),s[i].getName());
}
System.out.println(tree_map);
	}

}
