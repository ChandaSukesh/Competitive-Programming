// # Write the function hasnoprimes(int[][] arr) that takes a 2d array arr of integers, 
// # and returns True if arr does not contain any primes, and False otherwise.


class hasnoprimes {
	public boolean fun_hasnoprimes(int[][] arr){
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(checkPrime(arr[i][j])==true)
				{
					return false;
				}
				
			}
		}
		return true;
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
		for(int i=3;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}