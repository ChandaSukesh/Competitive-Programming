// # carry less addition means a  normal addition with the carry from each column ignored. 
// # So, for example, if we carryless-ly add 8+7, we get 5 (ignore the carry). And if we add 
// # 18+27, we get 35 (still ignore the carry). With this in mind, write the function 
// # fun_carrylessadd(x, y) that takes two non-negative integers x and y and returns their 
// # carryless sum. As the paper demonstrates, fun_carrylessadd(785, 376) returns 51.

import java.lang.Math; 
public class carrylessadd {
	public int fun_carrylessadd(int x, int y) {
		int ans=0;
		int count=0;
		while(x>0 || y>0)
		{
			int a=x%10;
			int b=y%10;
			ans+=(a+b)%10 * ((int)Math.pow(10,count));
			x=x/10;
			y=y/10;
			count+=1;
		}
		return ans;
	}
}
