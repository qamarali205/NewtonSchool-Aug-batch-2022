/*  
     
 class Node {
     Node next;
     int val;
 
     Node(int val) {
         this.val = val;
         next = null;
        
     }
 }
  */
 
  Node top = null;
 public void push(int x){    // [6,null]
     Node temp=new Node(x);  // top-> [6,null]->[7,null]
     temp.next=top;
     top=temp;
 } // add front
 
 public void pop(){
     if(top!=null){
         top=top.next;
     }
 } // delete front
 
 public void top(){
  if(top==null){
      System.out.println(0);
  }
  else{
      System.out.println(top.val);
  }
 } // print front