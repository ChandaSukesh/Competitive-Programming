import java.util.ArrayList;
import java.util.List;

// Recursion-Only powersOf3ToN(n) [15 pts]
// Write the function powersOf3ToN(n) that takes a possibly-negative float or int n, and returns a list of the 
// positive powers of 3 up to and including n. As an example, powersOf3ToN(10.5) returns [1, 3, 9]. If no such powers 
// of 3 exist, you should return the empty list. You may not use loops/iteration in this problem. 

public class PowersOf3ToN {
	public  int[] powersOf3ToN(double n) {
		// Your code goes here
		int m=(int)Math.floor(n);
		int count=0;
      	ArrayList<Integer> arr=new ArrayList<>();
		checkRecursion(m,count,arr);
		
		int[] ret = new int[arr.size()];
		for (int i=0; i < ret.length; i++)
		{
			ret[i] = arr.get(i).intValue();
		}
		return ret;
	}
   
	public  List<Integer> checkRecursion(int n,int power,List<Integer> arr)
	{
		int res=(int)Math.pow(3,power);
		if(res>n)
		{
			return arr;
		}
      	arr.add(res);
		return checkRecursion(n,power+1,arr);
		
	}
}