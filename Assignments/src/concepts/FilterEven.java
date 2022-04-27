package concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FilterEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {3,45,23,78,44,34,88};
      
       for(int i=0;i<arr.length; i++)
      {
	    if(arr[i]%2==0)
	     {
		    System.out.print(arr[i]+", ");
	     }
      }
       
       
       //******************** Using ArrayList**********************
       
       
       List<Integer> list1 = new ArrayList<>();
      for(int i=0;i<arr.length;i++)
      {
    	  list1.add(arr[i]);
      }
      System.out.println("\n");
    
   //   Iterator itr=list1.iterator();
     /* while(itr.hasNext())
      {
    	  System.out.println((int) itr.next());
    	  if(((int) itr.next())%2!=0)
 	     {
    		  System.out.println((int) itr.next());
 		  list1.remove(new Integer((int) itr.next()));
 	     }
      }*/
      for(Integer i:list1)
      {
    	  if(i%2!=0)
    	  {
    		  list1.remove(i);
    	  }
      }
      System.out.println(list1);
    
	}

}
