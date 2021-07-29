// nthPronicNumber(n) [20 pts]
// Write the function nthPronicNumber that takes a non-negative int n and returns the nth Pronic 
// Number. Pronic number is a number which is the product of two consecutive integers, that is, a 
// number n is a product of x and (x+1).

public class NthPronicNumber {
	public long nthPronicNumber(int n) {
		// Your code goes here
		int count=0;
        long found=0L;
        while(count<n)
		{
			found+=1;
			if(checkPronic(found))
			{
				count+=1;
			}
		}
		return found;
	}

	public boolean checkPronic(long n)
	{
		for(int i=0;i<Math.sqrt(n);i++)
		{
			if(n==(i*(i+1)))
			{
				return true;
			}
		}
		return false;
	}
}