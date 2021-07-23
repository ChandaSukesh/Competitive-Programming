// nthAutomorphicNumbers(n) [20 pts]
// In mathematics, an automorphic number is a number whose square "ends" in the same digits as the 
// number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 
// 76 and 890625 are all automorphic numbers.
public class NthAutomorphicNumbers {
	public long nthAutomorphicNumbers(int n) {
		// Your code goes here
		long count=0;
		long found=-1;
		while(count<n)
		{
			found=found+1;
			if(automorphic(n))
			{
				count=count+1;
			}
		}
		return found;
	}

	public boolean automorphic(int n)
	{
		long square=(n*n);
		int last=(int)square%10;
		if(last==n)
		{
			return true;
		}
		return false;
	}
}