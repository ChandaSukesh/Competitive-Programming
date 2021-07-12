// # Write the function isMultiple that takes two int values m and n 
// # and returns True if m is a multiple of n and False otherwise. 
// # Note that 0 is a multiple of every integer including itself. 
// # Also, you should make constructive use of the isFactor function you just wrote above.


class MyMath {
	public boolean isMultiple(int m, int n){
		// Your code goes here...
		if(m==0 ) return true;
		if(n==0) return false;
		if(m%n==0){
			return true;
		}
		
		return false;
	}
}