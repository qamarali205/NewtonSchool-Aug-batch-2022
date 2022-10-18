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

public static Node Insertion(Node head, int K){
//Enter your code here   
    Node ptr=head;
    while(ptr.next!=head){
        ptr=ptr.next;
    }
    Node newNode = new Node(K);

    ptr.next=newNode;
    newNode.next=head;
    return head;
}