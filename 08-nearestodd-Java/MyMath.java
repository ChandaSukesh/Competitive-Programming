// # Write the function nearestOdd(n) that takes an double n, 
// # and returns as an int value the nearest odd number to n. 
// # In the case of a tie, return the smaller odd value. 
// # Note that the result must be an int, so nearestOdd(13.0) is the int 13, and not the double 13.0.

public class MyMath {
	public int nearestOdd(double n){
		// your code goes here
		int val=(int)Math.ceil(n);
		if(val%2==0)
		{
			return val-1;
		}
		return val;
	}
}