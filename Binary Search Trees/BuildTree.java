public class BuildTree{
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

    public static boolean search(Node root, int target){
        if(root==null){
            return false;
        }
        if(root.val == target) return true;
        if(target>root.val) return search(root.right, target);
        if(target<root.val) return search(root.left, target);

        return false;
    }

    public static Node delete(Node root, int target){
        if(root==null) return null;
        if(target>root.val){
            root.right = delete(root.right, target);
        }
        else if(target<root.val){
            root.left = delete(root.left, target);
        }
        else{

            //case 1 : leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2 : single children
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case 3: both children
            Node IS = findIS(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }
        return root;
    }

    public static Node findIS(Node root){
        if(root.left==null) return root;
        return findIS(root.left);
    }
    public static void main(String[] args) {
        int[] nums = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<nums.length; i++){
            root = buildTree(nums[i], root);
        }
        inorder(root);
        System.out.println();

        root = delete(root, 5);
        inorder(root);
        System.out.println();



    }
}