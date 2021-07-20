// A Caesar Cipher is a s.charAt(i)mple cipher that works by shifting each letter in 
// the given message by a certain number. For example, if we shift the message 
// "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
// Write the function applyCaesarCipher(message, shift) which shifts the given 
// message by shift letters. You are guaranteed that message is a string, and 
// that shift is an integer between -25 and 25. Capital letters should stay capital 
// and lowercase letters should stay lowercase, and non-letter characters should not be changed. 
// Note that "Z" wraps around to "A". So, for example:
// assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
// assert(applyCaesarCipher("zodiac", -2) == "xmbgya")

public class CeaserCipher {
	public String fun_applycaesarcipher(String msg, int shift){
		// your code goes here
		int len=msg.length();
		String strvalue= "";
		for (int i=0;i<len;i++)
		{
			if (msg.charAt(i)>='a' && msg.charAt(i)<='z'){
				char ch=(char)(msg.charAt(i)+shift);
				if(ch<97)
				{
					int val='z'-('a'-ch-1);
					ch = (char)(val);
				}
				if(ch> 122)
				{
					int val='a'-'z' - 1;
					ch = (char)(ch + val);
				}
				strvalue=strvalue+ch;
			}
			else if(msg.charAt(i)>='A' && msg.charAt(i)<='Z'){
				char ch=(char)(msg.charAt(i)+shift);
				if(ch<65)
				{
					int val='Z'-('A'-ch-1);
					ch = (char)(val);
				}
				if(ch> 90)
				{
					int val1='A'-'Z' - 1;
					ch = (char)(ch + val1);
				}
				strvalue=strvalue+ch;
			}
			else
			{
				strvalue= strvalue +msg.charAt(i);
			}
		}
		return strvalue;
		
	}
	
}