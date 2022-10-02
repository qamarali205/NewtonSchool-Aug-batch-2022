static int Icecreams (int N, int D){
    //Enter your code here
    int remainder=0;
    int remaining=0;
     for(int i=1; i<=D; i++)
     {
         int eaten=N/2;
         remainder=N-eaten;
         remaining=3*remainder;
           N=remaining;
     }
     return N;
    }