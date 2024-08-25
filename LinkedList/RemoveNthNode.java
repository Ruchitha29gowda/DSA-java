public class RemoveNthNode {
    

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
    

    public void addFirst(int data){
        Node newNode = new Node(data);
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

    public void removeNthNode(int n){
        int size = 0;
        Node curr = head;
        while(curr!= null){
            size++;
            curr= curr.next;
        }

        curr = head;
        for(int i=1; i<size-n; i++){
            curr= curr.next;
        }
        curr.next = curr.next.next;
        System.out.println(size);
    }
    

    public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);

        ll.addFirst(2);
        ll.addFirst(1);

        ll.printlist(head);
        ll.removeNthNode(2);
        ll.printlist(head);
    }

}
