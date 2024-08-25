public class BST{

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node build(Node root, int val){
        if(root == null){
            root = new Node(val);
            System.out.println(val+" Inserted");
            return root;
        }
        if(val>root.data){
            root.right= build(root.right, val);
        }
        else{
            root.left= build(root.left, val);
        }
        return root;
    }

    public static void printInOrder(Node root){
        if(root==null) return ;
        else{
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }

    public static Node deleterBST(Node root,int val){
        if (root==null) {
            return null;
        }
        if(val<root.data){
            root.left = deleterBST(root.left, val);
        }
        else if(val>root.data){
            root.right = deleterBST(root.right, val);
        }
        else{
            //leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //single child
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //child with both subTrees
            else{
                Node INS = inorderSuccesor(root);
                root.data=INS.data;
                root.right = deleterBST(root.right, INS.data);
            }
        }

        return root;
    }

    public static Node inorderSuccesor(Node root){
        while (root.left!=null) {
            root=root.right;
        }

        return root;
    }

    public static void main(String[] args){
        int[] arr = {5,1,3,4,2,7};
        Node root= null;
        int i=0;
        while (i<arr.length) {
            root = build(root, arr[i]);
            i++;
        }
        System.out.println("DONE");

        printInOrder(root);
        System.out.println();
        root = deleterBST(root, 7);
        printInOrder(root);
        System.out.println();
        root = deleterBST(root, 5);
        printInOrder(root);
    }
}