// median(double[] arr) (10 pts)
// Write the non-destructive function median(a) that takes a array of ints or floats and returns the median value, 
// which is the value of the middle element, or the average of the two middle elements if there is no single middle 
// element. If the given array is empty, return 0.

public class Median {
	public int median(double[] arr) {
		// Your code goes here
		int len=arr.length;
		if(len==0)
		{
			return 0;
		}
		if(len==1)
		{
			return (int)arr[0];
		}
		
		int mid=0;
		if(len%2!=0)
		{
			
			mid=(int)arr[len/2];
		}
		else{
			// 
			
			mid=(int)Math.floor(arr[len/2 -1] + arr[(len/2 -1) + 1])/2;
			
		}
		return mid;
	}
}