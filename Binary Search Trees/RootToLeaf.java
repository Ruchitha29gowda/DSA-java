import java.util.ArrayList;

import org.w3c.dom.Node;

public class RootToLeaf {

    public static class  Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static Node buildTree(int val, Node root){
        if(root==null){
            root = new Node(val);
            // System.out.println(root.val);
            return root;
        }
        if(val>root.val){
            root.right = buildTree(val, root.right);
        }
        if(val<root.val){
            root.left = buildTree(val, root.left);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.val);

        if(root.left==null && root.right==null){
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        int[] nums = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<nums.length; i++){
            root = buildTree(nums[i], root);
        }
        inorder(root);
        System.out.println();

        ArrayList<Integer> path = new ArrayList<>();
        rootToLeaf(root, path);




    }
}
