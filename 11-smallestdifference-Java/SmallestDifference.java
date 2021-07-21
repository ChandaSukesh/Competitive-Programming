// Write the function smallestDifference(a) that takes a list of integers and returns 
// the smallest absolute difference between any two 
// integers in the list. If the list is empty, return -1. For example:
//       assert(smallestDifference([19,2,83,6,27]) == 4)
// The two closest numbers in that list are 2 and 6, and their difference is 4.
import java.util.*;

public class SmallestDifference {

    public int smallestDifference(int[] a) {
        // Your code goes here
        if(a.length==0)
        {
            return -1;
        }
        int diff=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                diff=Math.abs(a[j]-a[i]);
                
                if(diff<ans)
                {
                    ans=diff;
                }
            }
        }
        return ans;
    }
}
