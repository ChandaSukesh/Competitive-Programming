// hasConsecutiveDigits(n)  [10pts]
// Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that 
// number contains two consecutive digits that are the same, and False otherwise.

public class MyMath {
	public boolean hasConsecutiveDigits(int n) {
		// Your code goes here...
		String strVal=String.valueOf(n);
		for(int i=1;i<strVal.length();i++)
		{
			if(strVal.charAt(i)==strVal.charAt(i-1))
			{
				return true;
			}
		}
		return false;
	}
}