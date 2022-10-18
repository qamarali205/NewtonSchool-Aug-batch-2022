/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
       // Your code here
       Node ptr=head;
        while(ptr.next!=null){
        if(ptr.next.data==0){
            ptr.next=ptr.next.next; // delete it
            Node newNode =new Node(0); // add it in front
            newNode.next=head;
            head=newNode;
        }
        else{
            ptr=ptr.next;
        }
    }
    return head;
}