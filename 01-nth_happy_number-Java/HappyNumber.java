// Write the function nthHappyNumber(n) which takes a non-negative integer 
// and returns the nth happy number (where the 0th happy number is 1). 
// Here are some test assertions for you:

// https://en.wikipedia.org/wiki/Happy_number#:~:text=In%20number%20theory%2C%20a%20happy,starting%20with%20and%20eventually%20reaches
// Read more about the happy number from the above link.

// assert(nthHappyNumber(1) == 1)
// assert(nthHappyNumber(2) == 7)
// assert(nthHappyNumber(3) == 10)
// assert(nthHappyNumber(4) == 13)
// assert(nthHappyNumber(5) == 19)
// assert(nthHappyNumber(6) == 23)
// assert(nthHappyNumber(7) == 28)
// assert(nthHappyNumber(8) == 31)

public class HappyNumber {
	public int nthHappyNumber(int n){
		// Your code goes here...
		int count=0;
		int found=0;
		while(count<n)
		{
			found=found+1;
			if(isHappyPrime(found))
			{
				count+=1;
			}
		}

		return found;	
		
	}
	public int checkSum(int n)
	{
		return (n*n);
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

}