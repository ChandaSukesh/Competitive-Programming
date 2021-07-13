import java.util.ArrayList;

/**
 * 
 * Write the function setKthDigit(n, k, d) that takes three integers -- n, k, 
 * and d where n is a possibly-negative int, k is a non-negative int, and d is 
 * a non-negative single digit (between 0 and 9 inclusive). This function 
 * returns the number n with the kth digit replaced with d. Counting starts at 
 * 0 and goes right-to-left, so the 0th digit is the rightmost digit. Return 
 * the same number if k is invalid.
 * 
 * @author: Siva Sankar
 */

public class MyMath {
	/**
	 * This method replaces the kth digit with digit d in n.
	 * @param n
	 * @param k
	 * @param d
	 * @return return the new value n after replaced the kth digit with d,
	 * return the same value n if k is invalid.
	 */
	public int setKthDigit(int n, int k, int d) {
		// Your code goes here...
		boolean flag=false;
		if(n<0)
		{
			n=-n;
			flag=true;
		}
		int check=0;
		int ans=0;
		while(n!=0)
		{
			int last=n%10;
			// System.out.println(n);
			int power=(int)Math.pow(10,check);
			
			if(check==k)
			{
				ans=ans+(d *power) ;	
			}
			else
			{
				ans=ans+(last *power);
			}
			n=n/10;
			check++;
		}
		
		if(check==k)
		{
			int power=(int)Math.pow(10,k);
		// System.out.println(power);
			ans=ans+(d *power) ;
		}
		if(flag)
		{
			return -ans;
		}
		return ans;
		// String nval=String.valueOf(n);
		// if(k>nval.length())
		// {
			
		// 	return n;
		// }
		

		// // int[] arr=new int[nval.length()];
		// ArrayList<Integer> arr=new ArrayList<>();
		
		// for(int i=0;i<nval.length();i++)
		// {
		// 	arr.add(nval.charAt(i) - '0');
		// }

		// int count=0;
		// if(k==nval.length())
		// {
		// 	arr.set(k,d);
		// 	count=1000;
		// }
		// else{
		// 	k=nval.length()-k-1;
		// 	// arr[k]=d;
		// 	arr.set(k,d);
		// 	count=100;
		// }
		
	
		// int res=0;
		// int z=0;
		// while(count!=0)
		
		// // for(int i=0;i<nval.length();i++)
		// {
		// 	res=res+ count*arr.get(z);
		// 	count=count/10;
		// 	z++;
		// }

		// return res;
	}
}