// # Write the function nearestBusStop(street) that takes a 
// # non-negative int street number, and returns the nearest 
// # bus stop to the given street, where buses stop every 8th street, 
// # including street 0, and ties go to the lower street, 
// # so the nearest bus stop to 12th street is 8th street, 
// # and the nearest bus stop to 13 street is 16th street.

class NearestBusStop {
	public int nearestBusStop(int street){
		// your code goes here
		double value=(double)street/8;
		double check =(value- (int)(value))*10;

		int roundedVal=0;
		if((int)check==5)
		{
			roundedVal=(int)Math.floor(value);
		}
		else{
			roundedVal=(int)Math.ceil(value);
		}
		
		return (roundedVal*8);
	}
}