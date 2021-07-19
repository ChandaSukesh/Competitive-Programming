// isPerfectSquare(n)
// Write the function isPerfectSquare(n) that takes a possibly negative int value, and returns True if
// that is a perfect square (that is, if there exists an integer m such that
// m**2 == n), and False otherwise. Do not crash on non-ints nor on negative ints.

public class MyMath {
	public boolean isPerfectSquare(int n) {
		// Your code goes here
		if(n>=0)
		{
			double squareVal=Math.sqrt(n);
			int fValue=(int)Math.floor(squareVal);
			if(squareVal-fValue==0)
			{
				return true;
			}
		}
		
		return false;
	}
}
