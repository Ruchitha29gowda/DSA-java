public class IterativeSearch {

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

    public void printlist(ReverseList.Node head2){
        if(head2==null){
            System.out.println("Empty List!");
            return;
        }
        else{
            Node temp = head2;
            while (temp!=null) {
                System.out.print(temp.data +" -> ");
                temp = temp.next; 
            }
            System.out.println("null");
        }
    }
    

    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);

        ll.addFirst(2);
        ll.addFirst(1);

        ll.printlist(head);
    }
}
