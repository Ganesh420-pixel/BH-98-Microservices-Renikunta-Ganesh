package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NamesWithSur {

	List<String> l1=Arrays.asList("ganesh","aadi", "shesha","raju","naveen");
	
	List<String> l2=Arrays.asList("reni","kuruva", "thallu","bhasha","kamatham");
	
	List<String> l3= new ArrayList<>();
	{
	
    for(int i=0;i<l1.size();i++)
	{
		l3.add(l1.get(i)+"_"+l2.get(i));
	} 
}
}

