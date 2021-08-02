import java.util.HashSet;

// sameChars(s1, s2) [20 pts]
// Write the function sameChars(s1, s2) that takes two strings and returns True if the two strings are composed of 
// the same characters (though perhaps in different numbers and in different orders) -- that is, if every character 
// that is in the first string, is in the second, and vice versa -- and False otherwise. This test is 
// case-sensitive, so "ABC" and "abc" do not contain the same characters. The function returns False if either 
// parameter is not a string, but returns True if both strings are empty (why?).

public class SameChars {
	public boolean sameChars(String s1, String s2) {
		// Your code goes here
		HashSet<Character> a=new HashSet<Character>();
		HashSet<Character> b=new HashSet<Character>();

		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();

		for(int i=0;i<ch1.length;i++)
		{
			if(!a.contains(ch1[i]))
			{
				a.add(ch1[i]);
			}
		}

		for(int i=0;i<ch2.length;i++)
		{
			if(!b.contains(ch2[i]))
			{
				b.add(ch2[i]);
			}
		}
		if(a.equals(b))
		{
			return true;
		}


		return false;
	}
}