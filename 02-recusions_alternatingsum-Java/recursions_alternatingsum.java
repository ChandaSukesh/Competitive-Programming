// # Write the function alternatingSum(L) that takes a possibly-empty array of numbers, 
// # and returns the alternating sum of the array, where every other value is subtracted 
// # rather than added. For example: alternatingSum([1,2,3,4,5]) returns 1-2+3-4+5 
// # (that is, 3). If L is empty, return 0. You may not use loops/iteration in this problem.


class recursions_alternatingsum {
	public int fun_recursions_alternatingsum(int[] l){


		int diff_even=helperFn(l,0,0);
		int diff_odd=helperFn(l,1,0);
		return (diff_even-diff_odd);
	}

	
	
	public int helperFn(int[] l,int first,int sum)
	{
		if(first>=l.length)
		{
			return sum;
		}
		sum+=l[first];
		return helperFn(l,first+2,sum);
	}
}