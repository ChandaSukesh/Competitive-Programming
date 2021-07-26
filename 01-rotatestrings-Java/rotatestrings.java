// # Write the function rotatestring(s, k) that takes a string s and a possibly-negative integer k. 
// # If k is non-negative, the function returns the string s rotated k places to the left. 
// # If k is negative, the function returns the string s rotated |k| places to the right. So, for example:
// # assert(rotateString('abcd',  1) == 'bcda')
// # assert(rotateString('abcd', -1) == 'dabc')

class rotatestrings {
	public String fun_rotatestrings(String s, int n){

		if(n>s.length() || n<0)
		{
			n=Math.abs(Math.abs(n)-s.length());
		}
		
		String str=s.substring(n,s.length()) + s.substring(0, n);
		return str;
	}
}