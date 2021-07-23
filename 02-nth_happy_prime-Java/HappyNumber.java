// A happy prime is a number that is both happy and prime. 
// Write the function nthHappyPrime(n) which takes a non-negative integer 
// and returns the nth happy prime number (where the 0th happy prime number is 7).

// You can decompose the problem into subproblems as follows:
// First find whether a number is a happy number or not
// Then check whether it is a prime or not.

class HappyNumber {

	public boolean isPrime(int k) {
		// Your code goes here...
		if(k<2)
		{
			return false;
		}
		if(k==2)
		{
			return true;
		}
		if(k%2==0)
		{
			return false;
		}
		for(int i=3;i<(int)Math.sqrt(k);i++)
		{
			if(k%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public boolean isHappyPrime(int k) {
		// Your code goes here..
		int sum=0;
		while(sum != 1 && sum != 4)
		{
         	sum=0;
			while(k>0)
			{
				int m=k%10;
				sum+=checkSum(m);
            	k=k/10;
			}
			k=sum;
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

	public int nthHappyPrime(int n){
		// Your code goes here...
		int count=0;
		int found=0;
		while(count<n)
		{
			found=found+1;
			if(isHappyPrime(found) && isPrime(found))
			{
				count+=1;
			}
		}

		return found;	
	}
}