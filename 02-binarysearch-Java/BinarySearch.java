class BinarySearch {
	public int binary_search(int[] arr, int value){
        // Your code goes here
        int low=0;
        int high=arr.length;
        while(low<=high)
        {
                int mid=(low+high)/2;
                if(arr[mid]==value)
                {
                        return mid;
                }
                if(value<arr[mid])
                {
                        high=mid-1;
                }
                else{
                        low=mid+1;
                }
        }
        if(arr[low]!=value)
        {
                return -1;
        }
        return low;
	}
}