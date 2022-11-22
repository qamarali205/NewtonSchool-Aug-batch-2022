public class LinkedListscratch {
    
    static class LinkedList {
        String name;
        LinkedList next;
    
    }
    
    public static void main(String args[]) {
      
      String []array = new String[6];
      array[0] = "apple";
      array[1] = ("ball");
      array[2] = ("cat");
      array[3] = ("dog");
      array[4] = ("ele");
      array[5] = ("fan");
      
      
      LinkedList Head = makeLinkedListFromArray(array);
      iterateLinkedList(Head);    
    }
    
    public static void iterateLinkedList(LinkedList Head){
        LinkedList iterator = Head;
        while(iterator != null){
            System.out.println(iterator.name);
            iterator = iterator.next;
        }
    }
    
    public static LinkedList makeLinkedListFromArray(String []array){
        LinkedList Head = null;
        LinkedList prevNode = null;
        for(int i =0;i<array.length;i++){
          LinkedList newNode = new LinkedList();
          if(prevNode != null)
            prevNode.next = newNode;
            
          prevNode = newNode;
          if(i == 0){
              Head = newNode;
          }
          newNode.name = array[i];
          newNode.next = null;
        } 
        return Head;
    }
}