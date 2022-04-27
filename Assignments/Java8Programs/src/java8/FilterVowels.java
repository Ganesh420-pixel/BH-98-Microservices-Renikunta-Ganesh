package java8;

import java.util.stream.Stream;
public class FilterVowels {
	static int i=-1;
	public static boolean isVowel(char character)
    {
 
        if(character=='a' || character=='A' || character=='e' || character=='E' ||
                character=='i' || character=='I' || character=='o' || character=='O' ||
                character=='u' || character=='U'){
            return true;
        }else{
            return false;
        }
    }
	public static String stringOfVow(String str)
	{
		String s="";
		 for (int i = 0; i < str.length(); i++) {
	            char c=str.charAt(i);
	            if(isVowel(c))
	            {
	             s=s+c;   
	            }
	        }
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		NamesWithSur obj=new NamesWithSur();
     
    Stream<String> s = obj.l3.stream().map(x -> stringOfVow(x)); 
     
    s.forEach(x->System.out.println((++i)+" " +obj.l3.get(i)+" the vowels are-------> "+x));
	}

}
