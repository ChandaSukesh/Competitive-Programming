// # Write the function eggCartons(eggs) that takes 
// # a non-negative integer number of eggs, and returns 
// # the smallest integer number of cartons required to hold 
// # that many eggs, where a carton may hold up to 12 eggs

class EggCartons {
	public int eggCartons(int eggs) {
		// Your code goes here....
		
		double decValue=(double)eggs/12;
		int ans=(int)Math.ceil(decValue);

		return ans;
		
	}
}