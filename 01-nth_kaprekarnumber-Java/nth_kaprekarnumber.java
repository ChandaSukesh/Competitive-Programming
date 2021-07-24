// # Background: a Kaprekar number is a non-negative integer, the representation of whose square 
// # can be split into two possibly-different-length parts (where the right part is not zero) 
// # that add up to the original number again. For instance, 45 is a Kaprekar number, because 
// # 45**2 = 2025 and 20+25 = 45. You can read more about Kaprekar numbers here. The first several 
// # Kaprekar numbers are: 1, 9, 45, 55, 99, 297, 703, 999 , 2223, 2728,... 
// # With this in mind, write the function nthKaprekarNumber(n) that takes a non-negative int n 
// # and returns the nth Kaprekar number, where as usual we start counting at n==0.



class nth_kaprekarnumber {
	public long fun_nth_kaprekarnumber(int n){
		// for (int i=1; i<500; i++)
		// {
		// 	if (checkKaprekar(i))
		// 	 System.out.print(i + " ");
		// }
		
		
		// return -1;
		int count=0;
		long found=0;
		while(count<=n)
		{
			found=found+1;
			if(checkKaprekar(found))
			{
				count+=1;
			}
		}
		return found;
	}

	public boolean checkKaprekar(long n)
	{
		if(n==1)
		{
			return true;
		}
		long sqre=(n*n);
		long sqreAns=sqre;
		int digitCount=0;

		while(sqre>0)
		{
			digitCount+=1;
			sqre=sqre/10;
		}

		for(int i=1;i<digitCount;i++)
		{
			int ans=(int)Math.pow(10,i);
			if(ans==n)
			{
				continue;
			}
			long sum=sqreAns/ans + sqreAns%ans ;

			if(sum==n)
			{
				return true;
			}
		}

		return false;
	}
}