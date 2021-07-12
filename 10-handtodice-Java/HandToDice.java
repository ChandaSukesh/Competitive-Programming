// Write the (very short) function handtodice(hand) that takes a hand, which is a 3-digit
// integer, and returns 3 values, each of the 3 dice in the hand. For example:
// assert(handToDice(123) == (1,2,3))
// assert(handToDice(214) == (2,1,4))
// assert(handToDice(422) == (4,2,2))
// Hint: You might find and % useful here, and also getKthDigit().

public class HandToDice {
	public int[] handToDice(int hand) {
		// your code goes here
		int[] arr=new int[3];
		for(int j=2;j>=0;j--)
		{
			arr[j]=hand%10;
			hand=hand/10;
		}
		// return new int[0];
		return arr;
	}
}
