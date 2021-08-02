// Collapsewhitespaces [10 pts]
// Without using the s.replace() method, write the function 
// collapseWhitespace(s), that takes a string s and returns an 
// equivalent string except that each occurrence of whitespace in 
// the string is replaced by a single space. So, for example, 
// collapseWhitespace("a\t\t\tb\n\nc") replaces the three tabs 
// with a single space, and the two newlines with another single 
// space , returning "a b c ". Here are a few more test cases for 
// you:

// assert(cw("a\nb") == "a b")
// assert(cw("a\n   \t    b") == "a b")
// assert(cw("a\n   \t    b  \n\n  \t\t\t c   ") == "a b c ")
// These test cases are in python and please convert to java 
// and execute them.
// Once again, do not use s.replace() in your solution. 
// You should not use a regular expression library.

public class MyString {
    // Your code goes here...
    public static void main(String args[])
    {
        String str="a\n   \t    b  \n\n  \t\t\t c   ";
        String ans="";
        for(int i=0;i<str.length()-1;i++)
        {
            int val=str.charAt(i);
            if(val >= 97 && val<123)
            {
                ans+=str.charAt(i);
                ans+=" ";
            }
            
        }
        
        ans+=str.charAt(str.length()-1);
        // return ans;
        System.out.println("suk: "+ans);
    }
}
