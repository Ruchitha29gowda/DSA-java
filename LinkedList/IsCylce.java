public class IsCylce {
    public static class  Node {
        
        int data;
        Node next = null;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head =tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void printlist(Node head){
        if(head==null){
            System.out.println("Empty List!");
            return;
        }
        else{
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data +" -> ");
                temp = temp.next; 
            }
            System.out.println("null");
        }
    }

    public boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        IsCylce ll = new IsCylce();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        System.out.println(tail.data);
        tail.next=head;

        // ll.printlist(head);
        System.out.println(ll.isCycle());
    }
}
