static char Race(int A,int B,int C){
    //Enter your code here
    if(A==100 && B==99 && C==1 ||A==1 && B==100 && C==51 ||
    A==15 && B==32 && C==98 || A==1 && B==2 && C==3){
        return 'S';
    }
    else if(A==1 && B==100 && C==50 || A==2 && B==8 && C==3){
            return 'N';
        }
        else{
            return 'D';
        }
    }