// # Write the function wordWrap(text, width) that takes a string of text (containing only lowercase letters
// #  or spaces) and a positive integer width, and returns a possibly-multiline string that matches the 
// # original string, only with line wrapping at the given width. So wordWrap("abc", 3) just returns "abc", 
// # but wordWrap("abc",2) returns a 2-line string, with "ab" on the first line and "c" on the second line. 
// # After you complete word wrapping in this way, only then: All spaces at the start and end of each 
// # resulting line should be removed, and then all remaining spaces should be converted to dashes ("-"), 
// # so they can be easily seen in the resulting string. Here are some test cases for you:
// # assert(wordWrap("  abcdefghij", 4)  ==  """\
// # abcd
// # efgh
// # ij""")

// # assert(wordWrap(" a b c de fgh ",  4)  ==  """\
// # a-b-
// # c-de
// # -fgh""")

class wordwrap {
	public String fun_wordwrap(String s, int n){
		

		s=s.trim();
		s=s.replaceAll(" ","-");

		String str="";
		int count=0;
		int m=0;
		for(int i=0;i<s.length();)
		{
			if(count+n>s.length())
			{
				m=s.length()-count;
			}
			else{
				m=n;
			}
			
			while(m!=0)
			{
				str+=s.charAt(count);
				m-=1;
				count+=1;
				i++;
			}
			if(i!=s.length())
			{
				str+="\n";
			}

		}
		return str;

	}
}