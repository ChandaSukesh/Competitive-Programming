// Write the function fun_threelines_area(d1, d2, d3) 
// that takes length of 3 sides find the area of a triangle
// (return an int) given its side lengths.

import java.lang.Math.*;

public class MyMath {
	public int threeLinesArea(int a, int b, int c){
		// Your code goes here...
		double s=(double)(a+b+c)/2;
		int ans=(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ans;
	}
}
