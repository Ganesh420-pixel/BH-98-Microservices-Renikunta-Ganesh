package java8;

public class ThreadLambda  {

	public static void main(String[] args) {
		
		Runnable r= ()-> System.out.println("It is lambda");
		
	    Thread t1= new Thread(r);
	    t1.start();
	    
	}

}
