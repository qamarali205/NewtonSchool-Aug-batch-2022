import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
       public int front;
       public int rear;
       public  int cap;
       public int arr[];

    
        Main(int n){
        cap=1000000;
        arr = new int[cap];
        front=cap/2;
        rear=cap/2;
        }
        public void add(int x){
            
           if(rear==cap/2){
               
             arr[rear]=x;
             rear++;
             return;

           }
            if(arr[front]>x){
                arr[rear]=x;
                rear++;
            }
            
            else{
                front--;
                arr[front]=x;
                
            }
            }
            public void display(){
                for(int i = front;i<rear;i++){
                    System.out.print(arr[i]+" ");
                }
            } 

    

   
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int arr[] = new int[n];

                      for(int i=0;i<n;i++){
                          arr[i]=sc.nextInt();
                      }

                      Main st;
                      st = new Main(n);
                      for(int i=0;i<n;i++){
                          st.add(arr[i]);
                      }
                      st.display();

    }
}