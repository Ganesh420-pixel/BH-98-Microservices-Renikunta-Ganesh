package java8;

public class TestTread implements Runnable {
	
	public static void main(String[] args) {
		 TestTread obj = new TestTread();
		 Thread t=new Thread(obj);
		 t.start();
	  }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("It is runnable without lambda");
		
	}
	

}
