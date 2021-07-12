// # Write the function isFactor(f, n) that takes 
// # two int values f and n, and returns True 
// # if f is a factor of n, and False otherwise. 
// # Note that every integer is a factor of 0.

class MyMath {
	public boolean isFactor(int f, int n){
		// your code goes here
		if(n==0)
		{
			return true;
		}
		if(f==0)
		{
			return false;
		}
		if(n%f==0)
		{
			return true;
		}
		return false;
	}
}