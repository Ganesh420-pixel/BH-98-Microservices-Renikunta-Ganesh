package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class SortingMonths {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
     List<String> l= new ArrayList<String>();
     l.add("MAY");
     l.add("APRIL");
     l.add("JANUARY");
     l.add("MARCH");
     
     Map<Integer,String> m=new LinkedHashMap<Integer,String>();
     for(int i=0;i<l.size();i++)
     {
Date date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(l.get(i));
Calendar cal = Calendar.getInstance();
cal.setTime(date);
int n=cal.get(Calendar.MONTH);
 
 m.put(n+1,l.get(i));
   //  System.out.println(l);
     }
     Set<Integer> l2=new LinkedHashSet<Integer>(m.keySet());
     List<Integer> l3=new ArrayList<Integer>(l2);
     Collections.sort(l3);
     
     Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
     for(Integer i: l3)
     {
    	 m1.put(i,m.get(i));
     }
     System.out.println(m1.values());
	}

}
