import java.util.Arrays;
import java.util.HashSet;

// nondestructiveRemoveRepeats(L)
// Write the function nondestructiveRemoveRepeats(L), which takes a list L and nondestructively returns a new list in which any repeating elements in L are removed.
// Specify the time complexity based on the solution that you have given.

// Here are the sample test cases.
// For example:
// assert(nondestructiveRemoveRepeats([1, 3, 5, 3, 3, 2, 1, 7, 5]) == [1, 3, 5, 2, 7])
// assert(nondestructiveRemoveRepeats([1, 5, 3, 3, 2, 1, 7, 5]) == [1, 5, 3, 2, 7])
// assert(nondestructiveRemoveRepeats([1, 2, 3, 5, 3, 3, 2, 1, 7, 5]) == [1, 2, 3, 5, 7])


public class List {
    public static void main(String args[])
    {
        // Your code goes here....
        int [] arr1={1, 3, 5, 3, 3, 2, 1, 7, 5};
        int[] arr2={1, 3, 5, 2, 7};
        
        if(Arrays.equals(nondestructiveRemoveRepeats(arr1),arr2))
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static int[] nondestructiveRemoveRepeats(int[] arr)
    {
        HashSet<Integer> hset=new HashSet<Integer>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!hset.contains(arr[i]))
            {
               arr[count]=arr[i];
               count+=1;
            }
           hset.add(arr[i]);
        }
        
        int ansarr[] =new int[count];
        for(int i=0;i<count;i++)
        {
            ansarr[i]=arr[i];
        }
        return ansarr;
        
    }
}