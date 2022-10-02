static int RotationPolicy(int A, int B){
    //Enter your code here
    int n=0;
    for(int j=A; j<=B; j++){
        if(j%6==2 || j%6==0){
            n++;
        }
    }
    return n;
    }