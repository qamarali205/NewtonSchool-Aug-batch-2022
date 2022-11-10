/*
    int top=-1; // index of current top
    int a[] // array which contain element of stack 
*/
// function to add element in the stack
//x=element to be added
//size=maximum size of array
//.  [5,6 ,7 ,9 ].  = 4
//. -1.       t          
 void push(int x,int size)
    {
        // x 
        // size - maximu
        // top
        if(top==size-1){ // overflow
            System.out.println("Stack overflow");
        }

        else{
            top++;
            a[top]=x;
        }
    }
    // x- add 
    // size - corner case

    // Function to pop element from stack
     void pop()
    {
       if(top==-1){
           System.out.println("Stack underflow");
       }
       else{
           top--;
       }
    }

     void top()
    { // print the top element
       if(top==-1){
           System.out.println("Empty stack");
       }
       else{
           System.out.println(a[top]);
       }
    }