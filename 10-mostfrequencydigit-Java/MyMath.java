import java.util.HashMap;
import java.util.Map;

// mostFrequentDigit(n) [10pts]
// Write the function mostFrequentDigit(n), that takes a non-negative integer n and returns the digit from 0 to 9 
// that occurs most frequently in it, with ties going to the smaller digit.

public class MyMath {
	public int mostFrequentDigit(int n) {
		// Your code goes here
		HashMap<Character,Integer> hmap=new HashMap<>();
		String str=String.valueOf(n);
		
		for(int i=0;i<str.length();i++)
		{
			
			if(!hmap.containsKey(str.charAt(i)))
			{
				hmap.put(str.charAt(i),1);
				
			}
			else{
				hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
			}
		}
		int count=0;
		char ans=' ';
		
		for(Map.Entry e: hmap.entrySet())
		{
			
			int val=(int) e.getValue();
			
			if(val>count)
			{
				
				count=val;
				// System.out.println(e.getKey());
				ans=(char)e.getKey();
				// ans=(int) e.getKey()-'0';
			}
		}
		
		return ans-'0';
	}
}