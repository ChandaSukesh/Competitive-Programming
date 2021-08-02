import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// longestDigitRun(n) [20 pts]
// Write the function longestDigitRun(n) that takes a possibly-negative int value n and returns 
// the digit that has the longest consecutive 
// run, or the smallest such digit if there is a tie. So, longestDigitRun(117773732) returns 7 (
// because there is a run of 3 consecutive 7's), 
// as does longestDigitRun(-677886).

public class LongestDigitRun {
	public int longestDigitRun(int n) {
		// Your code goes here
		HashMap<Integer,Integer> hmap=new HashMap<>();
		n=Math.abs(n);
		int prev=0;
		while(n>0)
		{
			int m=n%10;
			if(m!=prev)
			{
				hmap.put(m,1);
			}
			else{
				if(!hmap.containsKey(m))
				{
					hmap.put(m,1);
				}
				else{
					hmap.put(m,hmap.get(m) + 1);
				}
			}
			
			prev=m;
			n=n/10;

		}
		int ans=Integer.MIN_VALUE;
		int key=0;
		for(Map.Entry e:hmap.entrySet())
		{
			int val=(int)e.getValue();
			if(val>ans)
			{
				key=(int)e.getKey();
				ans=val;
			}
		}
		return key;
	}
}