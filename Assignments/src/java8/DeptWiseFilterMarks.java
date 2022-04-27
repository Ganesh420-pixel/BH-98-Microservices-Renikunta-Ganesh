package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class DeptWiseFilterMarks {

	public static void main(String[] args) {

		Department d1 = new Department(111,"EEE");
		Department d2 = new Department(222,"ECE");
		Department d3 = new Department(333,"CSE");

		Student s1 = new Student(101,"mahesh",d1,90,95,93);
		Student s2 = new Student(102,"Ravi",d2,87,92,89);
		Student s3 = new Student(103,"Ganesh",d2,66,97,78);
		Student s4 = new Student(104,"Bhanu",d3,79,87,85);
		Student s5 = new Student(105,"Thilak",d2,94,78,81);
		Student s6 = new Student(106,"suresh",d1,91,92,85);
		Student s7 = new Student(107,"Ravindra",d3,83,67,90);




		List<Student> stlist = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);

		for(Student st:stlist)
		st.setTotal(st.getCmarks()+st.getMmarks()+st.getPmarks());

		Map<Department, List<Student>> result = stlist.stream().collect(Collectors.groupingBy(Student::getDept_id));

		for(List<Student> st:result.values()) {
		Optional<Student> maxmarks = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getTotal)));
		System.out.println(maxmarks);
		}
		}


}
