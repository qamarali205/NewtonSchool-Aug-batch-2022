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

public static void deleteNode(Node D) {
//Enter your code here
      Node temp=D.next;
       D.val=temp.val;
       D.next=temp.next;
       temp=null;
      
}