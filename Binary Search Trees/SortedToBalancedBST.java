public class SortedToBalancedBST {

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

    public static Node buildTree(int[] nums, int start, int end){
        if(start>end) return null;
        
        int mid = (start+end)/2;
        Node root = new Node(nums[mid]);

        root.left = buildTree(nums, start, mid-1);
        root.right = buildTree(nums, mid+1, end);

        return root;
    }
    public static void main(String[] args) {
        // int[] nums = {3,5,6,8,10,11,12};
        int[] nums = {-10,-3,0,5,9};
        Node root = buildTree(nums, 0, nums.length-1);
        preorder(root);





    }
}
