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

public static Node addElement(Node head, int k) {
//enter your code here
   Node temp=head;
    Node newNode=new Node(k);

    if(head==null){
        return newNode;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
    newNode.next=null;
  
      return head;
}