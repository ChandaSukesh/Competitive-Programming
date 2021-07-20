// Write the function findIntRoots(a,b,c) that takes 
// the int coefficients a, b, c of a quadratic equation of this form:
//      y = ax2 + bx + c
// You are guaranteed the function has 2 real roots, and in fact that 
// the roots are all integers. Your function should return these 2 int roots as a list
// in increasing order. How does a function return multiple values? Like so:
// return root1, root2


public class MyMath {
	public int[] find_int_roots(int a, int b, int c){
		int[] arr = new int[2];

		// Your code goes here...
		double pow=Math.pow(b,2);
		int b1=(int) (-b +(Math.sqrt(pow-(4*a*c))))/(2*a);
		int b2=(int) (-b -(Math.sqrt(pow-(4*a*c))))/(2*a);

		if(b1>b2)
		{
			arr[0]=b2;
			arr[1]=b1;
		}
		else{
			arr[0]=b1;
			arr[1]=b2;
		}
		return arr;
	}
}