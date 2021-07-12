// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// import java.util.List;

// This is the most complicated part. Write the function playstep2(hand, dice) that plays step 2 as
// explained above. This function takes a hand, which is a 3-digit integer, and it also takes dice,
// which is an integer containing all the future rolls of the dice. For example, if dice is 5341,
// then the next roll will be a 1, then the roll after that will be a 4, then a 3, and finally a 5.
// Note that in a more realistic version of this game, instead of hard-coding the dice in this way,
// we'd probably use a random-number generator.

// With that, the function plays step2 of the given hand, using the given dice to get the next rolls
// as needed. At the end, the function returns the new hand, but it has to be ordered, and the
// function also returns the resulting dice (which no longer contain the rolls that were just used).

// For example:
// assert(playstep2(413, 2312) == (421, 23))
// Here, the hand is 413, and the future dice rolls are 2312. What happens? Well, there are no
// matching dice in 413, so we keep the highest die, which is a 4, and we replace the 1 and the 3
// with new rolls. Since new rolls come from the right (the one's digit), those are 2 and 1. So the
// new hand is 421. It has to be sorted, but it already is. Finally, the dice was 2312, but we used 2
// digits, so now it's just 23. We return the hand and the dice, so we return (421, 23).

// For Example:
// assert(playstep2(544, 456) == (644, 45))
// If you have 2 matching dice (a pair), keep the pair and roll one die to replace the third die.
// So the output is (644, 45)

// Here are some more examples. Be sure you carefully understand them:
// assert(playstep2(413, 2312) == (421, 23))
// assert(playstep2(413, 2345) == (544, 23))
// assert(playstep2(544, 23) == (443, 2))
// assert(playstep2(544, 456) == (644, 45))
// Hint: You may wish to use handToDice(hand) at the start to convert the hand into the 3 individual
// dice.
// Hint: Then, you may wish to use diceToOrderedHand(a, b, c) at the end to convert the 3 dice back
// into a sorted hand.
// Hint: Also, remember to use % to get the one's digit, and use //= to get rid of the one's digit.
// Hint: You may wish to write a helper function for max(a,b,c) to find the largest of 3 values, and min(a,b,c) to find the smallest.

public class PlayStep2 {
	public int[] playStep2(int hand, int dice) {
		// Your code goes here
		int[] arr=new int[2];
		// ArrayList<Integer> arr=new ArrayList<>();
		String hand_value=String.valueOf(hand);
		char digits[]=hand_value.toCharArray();
		int a=digits[0] -'0';
		int b=digits[1]-'0';
		int c=digits[2]-'0';
		int highestVal=0;
		int dice_val=dice;
		if(a==b || b==c || c==a)
		{
			if(a==b)
			{
				if(dice_val%10 > b)
				{
					highestVal= dice_val%10;
					arr[0]=highestVal*100 + a*10 + b*1;
				}
				else{
					arr[0]=a*100 + b*10 + (dice_val%10 )*1;
				}
				dice_val/=10;
			}
			else if(b==c){
				// highestVal=maxFn(a,dice_val%10,0);
				if(dice_val%10 > b)
				{
					highestVal= dice_val%10;
					arr[0]=highestVal*100 + b*10 + c*1;
				}
				else{
					arr[0]=b*100 + c*10 + (dice_val%10 )*1;
				}
				dice_val/=10;
				
			}
			else{
				if(dice_val%10 > c)
				{
					highestVal= dice_val%10;
					arr[0]=highestVal*100 + a*10 + c*1;
				}
				else{
					arr[0]=a*100 + c*10 + (dice_val%10 )*1;
				}
				dice_val/=10;
			}
			arr[1]=dice_val;
		}
		else{
			if(maxFn(a,b,c)==a)
			{
				highestVal=a *100;
			}
			int j=10;
			for(int i=0;i<2;i++)
			{
				highestVal=highestVal+(dice_val%10)*j;
				// System.out.println("suk11: "+highestVal);
				j=j/10;
				dice_val=dice_val/10;
			}
			
			arr[0]=diceToOrderedHand(highestVal);
			arr[1]=dice_val;
		}
		
		return arr;		
	}
	public int diceToOrderedHand(int value)
	{
		String temp=String.valueOf(value);
		Integer[] lst=new Integer[temp.length()];
		
		for(int i=0;i<temp.length();i++)
		{
			lst[i]=temp.charAt(i)-'0';
		}
		Arrays.sort(lst,Collections.reverseOrder());
		int res=0;
		for(int i=0;i<lst.length;i++) {
			 res=res*10+lst[i];
		}
		return res;
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
}