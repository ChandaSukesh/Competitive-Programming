// # Write the function nthSmithNumber that takes a non-negative int n 
// # and returns the nth Smith number, where a Smith number is a composite (non-prime) 
// # the sum of whose digits are the sum of the digits of its prime factors (excluding 1). 
// # Note that if a prime number divides the Smith number multiple times, its digit sum 
// # is counted that many times. For example, 4 equals 2**2, so the prime factor 2 is 
// # counted twice, thus making 4 a Smith Number.
// # so fun_nthsmithnumber(0) should return 4
// # so fun_nthsmithnumber(1) should return 22

import java.lang.Math;  
public class nth_smithnumber {
	public int fun_nth_smithnumber(int n) {
		int count=0;
		int found=0;
		while(count<=n)
		{
			found+=1;
			if(!checkPrime(found))
			{
				if(checkSum(found) == checkFactors(found))
				{
					count+=1;
				}
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
		for(int i=3;i<Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public int checkSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int m=n%10;
			sum+=m;
			n=n/10;
		}
		return sum;
	}

	public int checkFactors(int n)
	{
		int sum=0;
		while(n%2==0)
		{
			sum=sum+2;
			n=n/2;
		}
		
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				sum=sum+checkSum(i);
				n=n/i;
			}
		}
		if(n>2)
		{
			sum=sum+checkSum(n);
         	return sum;
		}
      return sum;
	}
}
