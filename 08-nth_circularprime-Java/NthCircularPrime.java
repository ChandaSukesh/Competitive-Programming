// nthCircularPrime(n) [20 pts]
// Write the function nthCircularPrime that takes a non-negative int n and returns the nth 
// Circular prime, which is a prime number that does not contain any 0's and such that all the 
// numbers resulting from rotating its digits are also prime. The first Circular primes are 2, 3, 
// 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197... To see why 197 is a Circular prime, 
// note that 197 is prime, as is 971 (rotated left), as is 719 (rotated left again).

public class NthCircularPrime {
	public long nthCircularPrime(int n) {
		// your code goes here
		int count=0;
		int found=0;
		while(count<n)
		{
			found+=1;
			if(checkPrime(found) && checkRotation(found))
			{
				count+=1;
			}
		}
		return found;
	}
	public boolean checkPrime(int n)
	{
		if(n==2)
		{
			return true;
		}
		if(n<2 || n%2==0)
		{
			return false;
		}
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkRotation(int n)
	{
		String str=String.valueOf(n);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
			{
				return false;
			}
		}
		int len=str.length()-1;
		int count=len;
		int ans=0;
		while(n>0)
		{
			int m=n%10;
			ans =m*((int)Math.pow(10,count)) + ans;
			count-=1;
			n/=10;
		}
		if(checkPrime(ans))
		{
			return true;
		}
		return false;
	}
}
