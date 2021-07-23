// Write the method interleave(s1, s2) that takes two strings, s1 and s2, 
// and interleaves their characters starting with the first character in s1. 
// For example, interleave('pto', 'yhn') would return the string "python". 
// If one string is longer than the other, concatenate the rest of the remaining 
// string onto the end of the new string. For example ('a#', 'cD!f2') would return 
// the string "ac#D!f2". Assume that both s1 and s2 will always be strings.


public class MyString {
	public String interleave(String s1, String s2) {
		//	Your code goes here....
		int len=s2.length();
		int maxlen=s1.length();
		String str="";
		if(s1.length()<s2.length())
		{
			len=s1.length();
			maxlen=s2.length();
		}
		int i=0;
		for(i=0;i<len;i++)
		{
			str+=s1.charAt(i);
			str+=s2.charAt(i);
		}
		
		for(int j=i;j<maxlen;j++)
		{
			if(s1.length()>s2.length())
			{
				str+=s1.charAt(j);
				
			}
			else{
				str+=s2.charAt(j);
			}
		}
		
		return str;
	}
}