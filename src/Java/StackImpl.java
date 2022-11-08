import java.util.stream.StreamSupport;


//  [ , , , , , , , , , ] => 10 elements
// t
// cap=10
// top ->
public class StackImpl {

    int arr[];
    int top; // index of last element
    int capacity; // how many elements

    StackImpl(int size){ //10
        arr=new int[size];
        capacity=size;
        top=-1; // stack is empty
    }
    //0 arr[0]=data
    //1 arr[1]=data
    //2
    //3
    //. . ...... 9    10
    public void push(int data){

        if(top==capacity-1){
            System.out.println("Stack is full. No more elements can be pushed");
            return;
        }
        System.out.println("Pushing the data into the stack");
        top++;
        arr[top]=data;
    }

    public int pop(){ // remove the top element from the stack

        if(top==-1){
            System.out.println("Stack is empty. Nothing to pop.");
            return -1;
        }

        System.out.println("Removing the data into the stack");
        int topElement=arr[top];
        top--;//actual removal
        return topElement;
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty. Nothing at the peek.");
            return -1;
        }

        return arr[top];
    }

    public void print(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        StackImpl stack=new StackImpl(7);
        stack.push(5);
        stack.push(9);
        stack.push(12);
        stack.push(39);
        stack.push(1);
        stack.push(14);
        //stack.push(14);
        //stack.push(14);

        System.out.println(stack.pop());// 14
        System.out.println(stack.pop());//1
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        stack.push(100);
        stack.push(200);
        System.out.println(stack.pop());

        stack.push(200);
        stack.push(200);
        stack.push(200);

        System.out.println(stack.size()); //4


        System.out.println(stack.peek());

        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
    }

}