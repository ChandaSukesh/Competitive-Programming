// nthWithProperty309(n) [20 pts]
// We will say that a number n has "Property309" if its 5th power contains every 
// digit (from 0 to 9) at least once. 309 is the smallest number with this property. 
// Write the function nthWithProperty309 that takes a non-negative int n and returns 
// the nth number with Property309.

public class NthWithProperty309 {
	public int nthWithProperty309(int n) {
		//Your code goes here
		int found=0;
		int count=0;

		while(count<=n)
		{
			found+=1;
			if(check309(found))
			{
				count+=1;
			}
		}
		return found;
	}

	public  static boolean check309(int n)
	{
		long pow1=(int)Math.pow(n,2);
      long re=pow1*n*n;
		long ans=re*n;
      

		boolean arr[] =new boolean[10];
      String str=String.valueOf(ans);
      int len=str.length()-1;
		while(ans>0)
		{
         
         
			int m=str.charAt(len)-'0';
         //Math.abs((int)ans%10);
			arr[m]=true;
			ans/=10;
         len-=1;
		}

		for(int i=0;i<=9;i++)
		{
			if(arr[i]==false)
			{
				return false;
			}
		}
		return true;

	}
}
