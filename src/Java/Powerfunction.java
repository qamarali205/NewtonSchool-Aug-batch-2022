class Solution{
    static long power(int a, int n){
   if(n==0)
       return 1;
   if(n==1)
       return a;
   if (n%2 == 1) // if 'n' is odd
   {
       return (long)(a*power(a,n-1)%1000000007);
   }
   else // if 'n' is even
   {
       long m = power(a,n/2);
       return (long)((m*m)%1000000007);
   }
}
   
}