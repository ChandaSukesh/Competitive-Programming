// # Write the function isRectangular(int[][] arr) that takes a possibly-2d 
// # array arr and returns True  if it is rectangular, so each row has
// #  the same number of elements. Return False otherwise.

class IsRectangular {
	public boolean isRectangular(int[][] arr) {
		// Your code goes here...
	
		int k=arr[0].length;
		for(int i=0;i<arr.length;i++)
		{
			int j=arr[i].length;
			if(k!=j)
			{
				return false;
			}
			k=j;
		}
		return true;
	}
}