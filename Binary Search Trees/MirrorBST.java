public class MirrorBST {
    public static class  Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+"   ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void mirror(Node root){
        if(root == null) return;
        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(10);
        root.right.right = new Node(11);

        preorder(root);
        mirror(root);
        System.out.println();
        preorder(root);
    }
}
