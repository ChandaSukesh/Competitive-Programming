class Additiveprime{
    public static void main(String args[]){
        System.out.println(isAdditive(2));
        System.out.println(isAdditive(3));
        System.out.println(isAdditive(5));
        System.out.println(isAdditive(13));
        System.out.println("*****************");
        System.out.println(isAdditive(23));
        System.out.println(isAdditive(29));
        System.out.println(isAdditive(41));
        System.out.println(isAdditive(98));
        System.out.println("*****************");
        System.out.println(isAdditive(198));
        System.out.println(isAdditive(290));
        System.out.println(isAdditive(67));
        System.out.println(isAdditive(97));
    }
    public static boolean isAdditive(int n)
    {
        int sum=0;
        if(isPrime(n))
        {
            while(n>0)
            {
                int m=n%10;
                sum+=m;
                n=n/10;
            }
            // System.out.println("suk: "+sum);
            if(isPrime(sum))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int n)
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

        for(int i=3;i<(int)Math.sqrt(n);i=i+2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}