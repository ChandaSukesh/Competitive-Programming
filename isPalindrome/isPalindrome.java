class isPalindrome{
    public static void main(String args[])
    {
       System.out.println(isPalind(121));
    }

    public static boolean isPalind(int n)
    {
        // int count=0;
        // int found=0;
        // while(count<n)
        // {
        //     found=found+1;
        //     if(checkPalindrome(found) && checkPrime(found))
        //     {
        //         count+=1;
        //     }
        // }
        if(checkPalindrome(n) && checkPrime(n))
        {
            return true;
        }
        return false;
    }

    public static boolean checkPalindrome(int n)
    {
        String str=String.valueOf(n);
        int len1=0;
        int len2=str.length();

        while(len1>len2)
        {
            if(str.charAt(len1) != str.charAt(len2))
            {
                return false;
            }
            len1+=1;
            len2+=1;
        }
        return true;
    }

    public static boolean checkPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<=(int)Math.sqrt(n);i=i+2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}