package codechallenges.linkedList;

// I watched this walk through on youtube to learn how to do this... https://www.youtube.com/watch?v=SMIq13-FZSE
// Also looked at Sarah Fisher's repo but didn't end up using any of it.

public class LinkedList {

    Node head;

    public void insert(int value) {

        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;

    }

}    public String showString() {
        Node n = head;
        String result = "";
        while(n.next != null) {
            String potato = String.format("{ %d } -> ",n.value);
            result += potato;
            n = n.next;
        }
        String banana = String.format("{ %d } -> NULL",n.value);
        result += banana;
        System.out.println(result);
        return result;
    public boolean includes(int value){
        Node n = head;
        while(n.next != null){
            if(n.value == value){
                return true;
            }
            n = n.next;
        }
        if(n.value == value){
            return true;
        }
        return false;
    }
    public void append(int value){
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        Node newNode = new Node();
        n.next = newNode;
        newNode.value = value;
    }
    public void insertBefore(int value, int newValue){
        Node n = head;
        Node next = n.next;
        while(n.next != null){
            if(n.value == value || next.value == value){
                break;
            }
            n = n.next;
        }
        if(next.value == value) {
            Node newNode = new Node();
            newNode.next = next;
            n.next = newNode;
            newNode.value = newValue;
        } else if (n.value == value && n.next != null){
            Node newNode = new Node();
            newNode.value = newValue;
            newNode.next = head;
            head = newNode;
        } else {
            System.out.println("Value not found in linked list");
        }
    }
    public void insertAfter(int value, int newValue) {
        Node n = head;
        Node next = n.next;
        while (n.next != null || n.value == value) {
            if (n.value == value) {
                Node newNode = new Node();
                newNode.value = newValue;
                n.next = newNode;
                newNode.next = next;
                break;
            }
            n = n.next;
            next = n.next;
        }
    }
    public int returnFromEnd(int k){
        if(k < 0){
            throw new IllegalArgumentException();
        }
        int counter = 0;
        Node n = this.head;
        while(n.next != null){
            n = n.next;
            counter++;
        }
        if(k - 1 > counter){
            throw new IllegalArgumentException();
        }
        n = this.head;
        for(int i = 0;i < counter - k;i++){
            n = n.next;
        }
        return n.value;
    }
//    public static LinkedList mergeList(LinkedList list1, LinkedList list2){
//        Node current1 = list1.head;
//        Node current2 = list2.head;
//        Node zipper1;
//        Node zipper2;
//        while(current1 != null && current2 != null){
//
//            zipper1 = current1.next;
//            zipper2 = current2.next;
//
//            current1.next = zipper2;
//            current2.next = zipper1;
//
//            // switching the pointers
//            current1 = zipper1;
//            current2 = zipper2;
//
//        }
//        list2.head = current2;
//        return list1;
//    }
}