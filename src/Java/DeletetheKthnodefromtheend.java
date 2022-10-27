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

public static Node deleteElement(Node head,int k) {
//enter your code here
      int c=0;
        Node temp=head,old=null;

        while(temp!=null){
            temp=temp.next;
            c++;
        }
        
        temp=head;
        for(int i=1;i<=c-k;i++){
            old=temp;
            temp=temp.next;
        }
        if(temp==head)
           head=head.next;
        else
         old.next=temp.next;

        return head;
    }