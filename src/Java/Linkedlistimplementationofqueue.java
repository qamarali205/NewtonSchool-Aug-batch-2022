class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue() // remove first
 {
  if(currentSize!=0){
        front=front.next;
        currentSize--;
  }
 }
 

 // rrrrrrrrrrr-> r
 //.              p

 public void enqueue(int data) // add last
 {   
 //enter your code here
 Node newNode=new Node(data);
 if(currentSize==0){
     front=newNode;
 }
 else{
        // fit it at the end
        rear.next=newNode;
 }
 rear=newNode;
 currentSize++;

 }
 
 public void displayfront(){ // printing head/front
     //enter your code here
     // 0
     if(currentSize==0){
         System.out.println(0);
     }
     else{
         System.out.println(front.val);
     }
 }
}