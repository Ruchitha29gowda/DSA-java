public class Add {

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


    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail = newNode;
    }

    public void add(int index , int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        if(index==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printlist(Node head){
        if(head==null){
            System.out.println("Empty List!");
            return;
        }
        else{
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data +"->");
                temp = temp.next; 
            }
            System.out.println(" null");
        }
    }
    

    public void removeFirst(){
        if(size==0){
            System.out.println("Already empty!!");
            return;
        }else if(size==1){
            System.out.println(head.data +" deleted!");
            head=tail=null;
            size--;
            return;
        }
        System.out.println(head.data +" deleted!");
        head=head.next;
        size--;
    }

    public void removeLast(){
        if(size==0){
            System.out.println("Already empty!");
            return;
        }
        else if(size==1){
            System.out.println(tail.data +" deleted!");
            head=tail=null;
            size=0;
            return;
        }

        Node prev = head;
        while(prev.next.next!=null){
            prev=prev.next;
        }
        System.out.println(tail.data +" deleted!");
        prev.next=null;
        tail=prev;
        return;

    }

    
    public static void main(String[] args) {
        Add ll = new Add();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.printlist(head);
        ll.add(3, 4);
        ll.printlist(head);
        System.out.println(ll.size);

        System.out.println();

        // ll.removeFirst();
        // ll.printlist(head);

        ll.removeLast();
        ll.printlist(head);
    }
}
