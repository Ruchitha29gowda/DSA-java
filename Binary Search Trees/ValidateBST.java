public class ValidateBST {

    public static class  Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static boolean validateBST(Node root, Node min, Node max){
        if(root ==null){
            return true;
        }

        if(min!=null && root.val<=min.val){
            return false;
        }

        if(max!=null && root.val>=max.val){
            return false;
        }

        return validateBST(root.left, min, root) && validateBST(root.right, root, max);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(3);

        System.out.println(validateBST(root, null, null));
    }
}
