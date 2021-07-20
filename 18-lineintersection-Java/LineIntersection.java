// lineintersection(m1, b1, m2, b2)[5pts]
// Write the function lineintersection(m1, b1, m2, b2) that takes four int or float values representing the 2 lines:
//     y = m1*x + b1
//     y = m2*x + b2
// This function returns the x value of the point of intersection of the two lines. If the lines are parallel, or identical, the function should return 0.

public class LineIntersection {
	public int lineIntersection(int m1, int b1, int m2, int b2) {
		// Your code goes here
		if(b1==b2 || m1==m2)
		{
			return 0;
		}
		else if(checkFn(m1,m2))
		{
			return 0;
		}
		else if(checkFn(m2,m1))
		{
			return 0;
		}
		else
		{
			return (b2-b1)/(m1-m2);
		}
		
	}

	public boolean checkFn(int n1,int n2)
	{
		if (n1==0)
		{
			return true;
		}
		else if(n2==0)
		{
			return false;
		}
		else if (n1%n2==0){
			return true;
		}
		
		else
		{
			return false;
		}
	}
}