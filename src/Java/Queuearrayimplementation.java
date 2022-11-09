/*
 
   class Queue{ 
     static final int MAX = 10000; 
     int rear=0,front=0; 
     int a[] = new int[MAX]; 
 }
    int rear=0,front=0; //pointer to rear and front
     int a[] //array that contain elements of queue
 */ 
 
 
 // [10000]
 
 //  0 ffffff... ....  499.   ,  1000
 public static void enqueue(int x, int k) // rear
     {
         if(rear==k){
           System.out.println("Queue is full");
           return;
         }
 
         a[rear]=x;
         rear++;
     }
 
 //.  6. 7 8 8
 //.  f.     r
    public static  void dequeue() // starting of queue fromnt
     {
       if(front==rear){
         System.out.println("Queue is empty");
         return;
       }
 
       // for(int i=0;i<rear-1;i++){
       //   a[i]=a[i+1];
       // }
       // rear--;
       // loop move all the elements 1 step behiond
       // rear --
       front++;  //-> working
     }
 
     public static void displayfront() // front
     {
       if(front==rear){
         System.out.println("Queue is empty");
         return;
       }
         System.out.println(a[front]);
     }
 }