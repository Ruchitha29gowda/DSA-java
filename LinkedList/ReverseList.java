public class ReverseList {
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
    
    public void reverse(){
        Node current  = head ;
        tail = head;
        Node prev = null;
        Node nxt= null;

        while(current!= null){
            nxt = current.next;
            current.next = prev;
            prev=current;
            current = nxt;
        }

        head = prev;
    }

    public static void main(String[] args) {
        ReverseList ll = new ReverseList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);

        ll.addFirst(2);
        ll.addFirst(1);

        ll.printlist(head);
        ll.reverse();
        ll.printlist(head);
    }

}
