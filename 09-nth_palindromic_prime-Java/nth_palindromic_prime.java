// # Write the function fun_nth_palindromic_prime(n) that takes a non-negative int n 
// # and returns the nth palindromic Prime, which is a palidrome number such that 
// # it is also a prime. For example, 313 is a palindrome and it is prime 
// # so 313 is an palindrome Prime. fun_nth_palindrome_prime(0) returns 2


class nth_palindromic_prime {
	public int fun_nth_palindromic_prime(int n){
		
		int count=-1;
        int found=0;
        while(count<n)
        {
            found=found+1;
            if(checkPalindrome(found) && checkPrime(found))
            {
				
                count+=1;
            }
        }
		return found;
	}

	public static boolean checkPalindrome(int n)
    {
		if(n==0)
		{
			return true;
		}
        String str=String.valueOf(n);
        int len1=0;
        int len2=str.length()-1;

        while(len1<len2)
        {
            if(str.charAt(len1) != str.charAt(len2))
            {
                return false;
            }
            len1=len1+1;
            len2=len2-1;
        }
        return true;
    }

    public static boolean checkPrime(int n)
    {
		if(n==0)
		{
			return true;
		}
        if(n<2)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<=(int)Math.sqrt(n);i=i+2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}