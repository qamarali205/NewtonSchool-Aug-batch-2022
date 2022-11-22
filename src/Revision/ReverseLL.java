//r(1)->r(2)->r(3)->r(4)
//        null<-1<-2<-3<-4
    public Node reverse(Node head){ // null<-1<->2<->3<->4->null
                                    //       h
                                    // null<-1<->2<->3<->4->null
                                    //                   h
                                    //  null<-1->2    1<-2<->3<-4->null
                                    //  h                       nh

                                    //    null<-1<-2
// 1->null
        // null
        if(head==null || head.next==null){
            return head;
        }

        Node newHead = reverse(head.next);

        head.next.next=head;
        head.next=null;
        //head.prev=head.next

        return newHead;
    }


    // h-> n<-1<-2<-3<-4
    //                 p  c


    public Node reverseIterative(Node head){ //-> returning the head of rebversed LL
        Node prev=null;
        Node current = head;

        Node temp;
        while(current!=null){
            temp=current.next;
            current.next=prev;
            prev=current; //movement for next
            current=temp; //movement for next
        }

        return prev;
    }