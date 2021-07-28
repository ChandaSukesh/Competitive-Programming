// isRotation(x, y) [15 pts]
// Write the function isRotation(x, y) that takes two non-negative integers x and y, both 
// guaranteed to not contain any 0's, and 
// returns True if x is a rotation of the digits of y and False otherwise. For example, 
// 3412 is a rotation of 1234. Any number 
// is a rotation of itself.

public class IsRotation {
	public boolean isRotation(int x, int y) {
		// Your code goes here
		String strX=String.valueOf(x);
		String strY=String.valueOf(y);
		for(int i=0;i<strX.length();i++)
		{
			String newX=strX.substring(i, strX.length()) + strX.substring(0,i);
			
			System.out.println(newX);
			if(newX.equals(strY))
			{
				return true;
			}
		}
		return false;
	}
}