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
     Node newNode = new Node(k);

        newNode.next=head;
        head=newNode;
        return head;
}