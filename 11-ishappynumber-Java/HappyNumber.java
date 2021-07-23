// ishappynumber(n) [10 pts]
// A happy number is a number defined by the following process: Starting with any positive integer, replace the 
// number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will 
// stay ), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 
// are happy numbers.
// https://en.wikipedia.org/wiki/Happy_number#:~:text=In%20number%20theory%2C%20a%20happy,starting%20with%20and%20eventually%20reaches
// Read more about the happy number from the above link.
// Write the function ishappynumber(n) which takes a possibly-negative integer and returns True if it is happy and 
// False otherwise. Note that all numbers less than 1 are not happy. Here are some test assertions for you:
// assert(ishappynumber(-7) == False)
// assert(ishappynumber(1) == True)
// assert(ishappynumber(2) == False)
// assert(ishappynumber(97) == True)
// assert(ishappynumber(98) == False)
// assert(ishappynumber(404) == True)
// assert(ishappynumber(405) == False)

public class HappyNumber {

	public boolean isHappyNumber(int n) {
		// your code goes here
		int sum=0;
		while(sum != 1 && sum != 4)
		{
         	sum=0;
			while(n>0)
			{
				int m=n%10;
				sum+=checkSum(m);
            	n=n/10;
			}
			n=sum;
			if(sum==1)
			{
				return true;
			}
			if(sum<1)
			{
				return false;
			}
		}
		return false;
      
	}

	
	public int checkSum(int n)
	{
		return (n*n);
	}
}