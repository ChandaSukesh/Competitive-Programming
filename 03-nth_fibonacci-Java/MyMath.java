// Background: The Fibonacci numbers are defined by F(n) = F(n-1) + F(n-2). 
// There are different conventions on whether 0 is a Fibonacci number, 
// and whether counting starts at n=0 or at n=1. Here, we will assume that 
// 0 is not a Fibonacci number, and that counting starts at n=0, 
// so F(0)=F(1)=1, and F(2)=2. With this in mind, write the function 
// nthfibonacciNumber(n) that takes a non-negative int n and returns the 
// nth Fibonacci number.


public class MyMath {
	public int nthFibonacciNumber(int n) {
		// Your code goes here...
		int a=1;
		int b=1;
		int c=0;
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 1;
		}
		n=n-1;
		while(n>0)
		{
			
			c=a+b;
			int temp=b;
			b=c;
			a=temp;
			n-=1;
		}

		return c;
		
	// 	int count=0;
	// 	int found=0;
	// 	while(count<n)
	// 	{
	// 		found+=1;
	// 		if(checkFibonacci(found))
	// 		{
	// 			count+=1;
	// 		}
			
	// 	}
	// 	return found;
	// }

	// public boolean checkFibonacci(int n)
	// {
		
	// 	return false;
	// }
}
}
