// dicetoorderedhand(a, b, c) [5pts]
// Write the function dicetoorderedhand(a, b, c) that takes 3 dice and
// returns them in a hand, which is a 3-digit integer. However, even if the
// dice are unordered, the resulting hand must be ordered so that the largest
// die is on the left and smallest die is on the right. For example:
// assert(dicetoorderedhand(1,2,3) == 321)
// assert(dicetoorderedhand(6,5,4) == 654)
// assert(dicetoorderedhand(1,4,2) == 421)
// assert(dicetoorderedhand(6,5,6) == 665)
// assert(dicetoorderedhand(2,2,2) == 222)
// Hint: You must write helper functions max(a,b,c) to find the largest of 3 values, and
// min(a,b,c) to find the smallest.

public class DiceToOrderedHand {
	public int diceToOrderedHand(int a, int b, int c) {
		// your code goes here
		int min_value=minFn(a,b,c);
		int max_value=maxFn(a,b,c);
		int second_max=0;
		if(max_value==a)
		{
			second_max=maxFn(0,b,c);
		}
		else if(max_value==b)
		{
			second_max=maxFn(a,0,c);
		}
		else
		{
			second_max=maxFn(a,b,0);
		}
		
		return max_value*100 + second_max*10 + min_value*1;
	}
	public int maxFn(int x,int y, int z)
	{
		if(x>y && x>z)
		{
			return x;
		}
		if(y>x && y>z)
		{
			return y;
		}
		return z;
		
	}
	public int minFn(int x,int y, int z)
	{
		if(x<y && x<z)
		{
			return x;
		}
		if(y<x && y<z)
		{
			return y;
		}
		return z;
		
	}	
}