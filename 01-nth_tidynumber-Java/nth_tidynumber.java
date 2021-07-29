// # Write the function nthTidyNumber that takes a non-negative int n and returns the nth Tidy Number. 
// # A tidy number is a number whose digits are in non-decreasing order.
// # fun_nth_tidynumber(0) = 1
// # fun_nth_tidynumber(1) = 2
// # fun_nth_tidynumber(5) = 6
// # fun_nth_tidynumber(15) = 17
// # fun_nth_tidynumber(35) = 46




class nth_tidynumber {
	public int fun_nth_tidynumber(int n){
		int count=0;
		int found=0;
		while(count<=n)
		{
			found+=1;
			if(checkTidy(found))
			{
				count+=1;
			}
		}
		return found;
	}
	public boolean checkTidy(int n)
	{

		int val=Integer.MAX_VALUE; 
		while(n>0)
		{
			
			int m=n%10;
			if(m>val || (m==0 && val==Integer.MAX_VALUE))
			{
				return false;
			}
			n/=10;
			val=m;
		}
		return true;
	}
}