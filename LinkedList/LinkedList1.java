public class LinkedList1{

    public static class Node {
        
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        
        ll.head = new Node(1);

        System.out.println(ll.head.next);
    }
}