import java.util.HashSet;
import java.util.Set;

// removeDuplicate(text) [10 pts]
// Write a method removeDuplicate(text) that remove all the duplicate characters from a given input String
// e.g. if given String is "JavaPython" then the output should be "JavPython".
// The second or further occurrence of duplicate should be removed.

public class MyString {
	public String removeDuplicate(String text) {
		// Your code goes here
		String res="";
		Set<Character> hset=new HashSet<>();
		
		for(int i=0;i<text.length();i++)
		{
			if(!hset.contains(text.charAt(i)))
			{
				hset.add(text.charAt(i));
				
				res+=text.charAt(i);
			}
		}
		
		return res;
	}
}