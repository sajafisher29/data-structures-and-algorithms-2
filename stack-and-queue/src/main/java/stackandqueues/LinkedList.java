package stackandqueues;


public class LinkedList {

    Node head;

    public int peek(){
        return this.head.value;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else {
            return false;
        }
    }

}
