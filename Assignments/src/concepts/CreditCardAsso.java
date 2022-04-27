package concepts;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

class CreditCard implements Comparable<CreditCard>
 {
	 private int id;
	 private String name;
	 private String date;
	public CreditCard(int id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
//	 Date exDate = new SimpleDateFormat("dd/mm/yyyy")
         //    .parse(date);
	@Override
	public int hashCode() {
		return Objects.hash(date, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return Objects.equals(date, other.date) && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(CreditCard o) {
		return this.getDate().compareTo(((CreditCard) o).getDate());
	}
	
 }

class Customer
{
	private String name;
	private int accno;
	private int cid;
	public Customer(String name, int accno, int cid) {
		super();
		this.name = name;
		this.accno = accno;
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accno=" + accno + ", cid=" + cid + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accno, cid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return accno == other.accno && cid == other.cid && Objects.equals(name, other.name);
	}
	
	
}
public class CreditCardAsso {
	
	public static List<CreditCard> sortL(Set<CreditCard> key)
	{
		List<CreditCard> list=new ArrayList<>(key);
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<CreditCard,Customer> mymap=new LinkedHashMap<>();
    
    CreditCard c1=new CreditCard(101,"aadi","10/03/2003");
    CreditCard c2=new CreditCard(102,"Raju","01/01/2002");
    CreditCard c3=new CreditCard(103,"shesha","05/02/2001");
    CreditCard c4=new CreditCard(104,"ganesh","01/01/2005");
    
    Customer k1=new Customer("aadi",1234,101);
    Customer k2=new Customer("Raju",1534,102);
    Customer k3=new Customer("shesha",1264,103);
    Customer k4=new Customer("ganesh",3234,104);
     
    mymap.put(c1,k1);
    mymap.put(c2,k2);
    mymap.put(c3,k3);
    mymap.put(c4,k4);
    
    List<CreditCard> l1=sortL(mymap.keySet());
    
    Map<CreditCard,Customer> map2=new LinkedHashMap<>();
    
    for(CreditCard cc: l1)
    {
      map2.put(cc,mymap.get(cc));
    }
  
      for(CreditCard cd: map2.keySet())
      {
    	  System.out.println(cd+" = "+map2.get(cd));
      }
      
    
	}

}
