// areAnagrams(s1, s2)
// Write the function areAnagrams(s1, s2) that takes two strings, 
// s1 and s2, that you may assume contain only upper and/or 
// lower case letters, and returns True if the strings are 
// anagrams, and False otherwise. Two strings are anagrams 
// if each can be reordered into the other. Treat "a" and "A"
// as the same letters (so "Aba" and "BAA" are anagrams). 
// You may not use sort() or sorted() or any other list-based
// functions or approaches. Hint: you may use s.count(), 
// which could be quite handy here.
// Hint: The time complexity can be achieved in Linear.

import java.io.*;
import java.util.*;

public class Anagram {
    
    public static void main(String[] args) {
        // write your test cases here...
        
        String str1="act";
        String str2="cat";
        System.out.println(anagramFn(str1,str2));


    }
    public static boolean anagramFn(String s1,String s2)
    {
        HashMap<Character,Integer> hmapA=new HashMap<>();
        HashMap<Character,Integer> hmapB=new HashMap<>();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length())
        {
            return false;
        }
        char arrs1[]=s1.toCharArray();
        char arrs2[]=s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            if(!hmapA.containsKey(arrs1[i]))
            {
                hmapA.put(arrs1[i],1);
            }
            else{
                int count=hmapA.get(arrs1[i]);
                hmapA.put(arrs1[i],count+1);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(!hmapB.containsKey(arrs2[i]))
            {
                hmapB.put(arrs2[i],1);
            }
            else{
                int count=hmapB.get(arrs2[i]);
                hmapB.put(arrs2[i],count+1);
            }
        }
        if(hmapA.equals(hmapB))
        {
            return true;
        }
        return false;
    }

}
