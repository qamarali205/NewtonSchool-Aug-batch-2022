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

public static int check(Node head) {
//enter your code here

    if(head==null)return 1;
        Node ptr = head.next;

        while(ptr!=null&&ptr!=head){
            ptr=ptr.next;
        }
        if(ptr==head)return 1;
        else return 0;
}