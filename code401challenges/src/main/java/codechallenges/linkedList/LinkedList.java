package codechallenges.linkedList;

// I watched this walk through on youtube to learn how to do this... https://www.youtube.com/watch?v=SMIq13-FZSE
// Also looked at Sarah Fisher's repo but didn't end up using any of it.

public class LinkedList {

    static Node head;

    public static void insert(int value) {

        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;

    }
    public static String showString() {
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
    }
    public static boolean includes(int value){
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
}
