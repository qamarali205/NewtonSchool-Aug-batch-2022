static void Pattern(int N){
    //Enter your code here
    int x=0;
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            System.out.print(x+4*j+" ");
        }
        System.out.println();
        x+=6; //x=x+6;
    }
    }