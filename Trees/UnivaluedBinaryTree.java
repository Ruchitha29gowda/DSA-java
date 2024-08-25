public class UnivaluedBinaryTree {
    
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean uniValued(Node root){
        if(root==null) return true;
        return helper(root, root.data);

    }

    public static boolean helper(Node root, int val){
        if(root==null) return true;
        if(root.data!=val) return false;
        return helper(root.left, val) && helper(root.right, val);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);

        // root.left.left = new Node(4); 
        // root.left.right = new Node(5); 
        // root.right.left = new Node(6); 
        // root.right.right = new Node(7); 

        System.out.println(uniValued(root));
    }
}
