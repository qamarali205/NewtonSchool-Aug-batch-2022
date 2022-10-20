/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) {  
      Node newNode=new Node(k); //   [null,k,null]

    if(head==null){
       head=newNode;
       return head; 
    }

    Node ptr=head;
    Node behind =null;
    while(ptr!=null){
        if(ptr.val<k){
            behind=ptr;
            ptr=ptr.next;
        }
        else{
            break;
        }
    }

    if(ptr==head){
        // insert it at the starting
         newNode.next=head;  // - next
         head.prev=newNode;  // - prev
         head=newNode;      //  - head
         return head;
    }

    if(ptr!=null){
        // insert in middle behind ptr
        newNode.next=ptr;
        newNode.prev=ptr.prev;
        ptr.prev=newNode;
        newNode.prev.next=newNode;
        return head;

    }
    else{
        // inserting at end
        behind.next=newNode;
        newNode.prev=behind;
        return head;
    }

    }