// import java.util.HashMap;
import java.util.HashSet;

// isLatinSquare(a)
// Write the function isLatinSquare(a) that takes a 2d list 
// and returns True if it is a Latin square and False otherwise.

// Check for Latin square in the following link:
// https://en.wikipedia.org/wiki/Latin_square

// Write your own test cases...

public class LatinSquare {
    
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(isLatinSquare(arr));
    }
    @SuppressWarnings("unchecked")
    public static boolean isLatinSquare(int[][] arr) {
        // Your code goes here...
        int len=arr.length;
        HashSet<Integer>[] mapRow=new HashSet[len];
        HashSet<Integer>[] mapCol=new HashSet[len];

        for(int i=0;i<len;i++)
        {
            mapRow[i]=new HashSet<Integer>();
            mapCol[i]=new HashSet<Integer>();
        }
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                mapRow[i].add(arr[i][j]);
                mapCol[j].add(arr[i][j]);
            }
        }
        int unUsedValue=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(arr[i][j] <=0 || arr[i][j]>len)
                {
                    unUsedValue+=1;
                }
            }
        }

        int rowVal=0;
        int colVal=0;
        for(int i=0;i<len;i++)
        {
            if(mapRow[i].size()!=len)
            {
                rowVal+=1;
            }
            if(mapCol[i].size()!=len)
            {
                colVal+=1;
            }
        }

        if(unUsedValue !=0 || rowVal!=0 || colVal!=0)
        {
            return false;
        }
        return true;
    }
}