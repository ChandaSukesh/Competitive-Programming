import java.util.HashMap;
import java.util.HashSet;

// # Write the function fun_isfactorish(n) that takes a value int n, 
// # and returns True if n is a (possibly-negative) integer with exactly 3 unique digits 
// # (so no two digits are the same), where each of the digits is a factor of the number 
// # n itself. In all other cases, the function returns False (without crashing).
// # For example:
// #  assert(fun_isfactorish(412) == True) # 4, 1, and 2 are all factors of 412
// #  assert(fun_isfactorish(-412) == True) # Must work for negative numbers!
// #  assert(fun_isfactorish(4128) == False) # 4128 has more than 3 digits
// #  assert(fun_isfactorish(112) == False) # 112 has duplicate digits (two 1's)
// #  assert(fun_isfactorish(420) == False) # 420 has a 0 (0 is not a factor)
// #  assert(fun_isfactorish(42) == False) # 42 has a leading 0 (only 2 unique digits)


class isfactorish {
	public boolean fun_isfactorish(int n){
		HashSet<Integer> hmap=new HashSet<>();
		n=Math.abs(n);
		int count=0;
		while(n>0)
		{
			int m=n%10;
			if(!hmap.contains(m))
			{
				count+=1;
				if(count>3)
				{
					return false;
				}
				
				if(checkPrime(m,n)==false)
				{
					return false;
				}
				n=n/10;
				hmap.add(m);
			}
			else{
				return false;
			}
			
		}
		if(count<3)
		{
			return false;
		}
		return true;
	}
	public boolean checkPrime(int value, int n)
	{
		if(value<=0)
		{
			return false;
		}
		else{
			if(n%value==0)
			{
				return true;
			}
		}
		
		return false;
	}
}