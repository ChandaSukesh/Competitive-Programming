// isMostlyMagicSquare(a) [15 pts]
// Write the function isMostlyMagicSquare(a) that takes an 2d list of numbers, which you may assume is an NxN square 
// with N>0, and returns True if it is "mostly magic" and False otherwise, where a square is "mostly magic" if:
// Each row, each column, and each of the 2 diagonals each sum to the same total.
// A completely magic square has additional restrictions (such as not allowing duplicates, and only allowing numbers 
// from 1 to N2), which we are not enforcing here, but which you can read about here. Note: any magic square is also 
// a "mostly magic" square, including this sample magic square:
// Read for more: https://en.wikipedia.org/wiki/Magic_square
// Here is another mostly-magic square:
// [ [ 42 ]]
// That square is 1x1 and each row, column, and diagonal sums to 42! And finally, here is a not-mostly-magic square:
// [ [ 1, 2],
//   [ 2, 1]]
// Each row and each column add to 3, but one diagonal adds to 2 and the other to 4.

public class IsMostlyMagicSquare {
	public boolean isMostlyMagicSquare(int[][] a) {
		// Your code goes here

		int rowsum=0;
		for(int i=0;i<a.length;i++)
		{
			int sum1=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum1+=a[i][j];
			}
			if(i>0 && rowsum!=sum1)
			{
				return false;
			}
			rowsum=sum1;

		}

		int colsum=0;
		for(int i=0;i<a.length;i++)
		{
			int sum2=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum2+=a[j][i];
			}
			if(i>0 && colsum!=sum2)
			{
				return false;
			}
			colsum=sum2;
		}
		int primaryDiagonal=0;
		int secondaryDiagonal=0;

		for(int i=0;i<a.length;i++)
		{
			primaryDiagonal+=a[i][i];
			secondaryDiagonal+=a[i][a.length-1-i];
		}

		if(colsum!=rowsum && (primaryDiagonal!=secondaryDiagonal) && (primaryDiagonal!=colsum))
		{
			return false;
		}
		return true;
	}
}
