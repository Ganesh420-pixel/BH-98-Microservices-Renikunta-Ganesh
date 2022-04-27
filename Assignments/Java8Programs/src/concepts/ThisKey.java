package concepts;

class Studend{
	
	int rollno;
	String name;
	
	Studend(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public void giveIntro() {
		System.out.println("Hi this is "+name);
	}
}

public class ThisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studend st = new Studend(101,"Rajesh");
		Studend st2 = new Studend(102,"Suraj");
		
		st.giveIntro();
		st2.giveIntro();
	}

}
