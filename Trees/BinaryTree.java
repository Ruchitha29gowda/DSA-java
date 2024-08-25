import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    public static class Tree {
        static int indx = -1;
        public Node preOrderBuildTree(int[] treeData){
            indx++;
            if(treeData[indx]==-1){
                return null;
            }
            else{
                Node newNode = new Node(treeData[indx]);
                newNode.left=preOrderBuildTree(treeData);
                newNode.right=preOrderBuildTree(treeData);
    
                return newNode;
            }
        }
    }

    public static void preOrder(Node root){
        if(root==null) return;
        else{
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void InOrder(Node root){
        if(root==null) return;
        else{
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
            
            
        }
    }

    public static void postOrder(Node root){
        if(root==null) return;
        else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
            
        }
    }
    

    public static void levelOrder(Node root){
        if(root==null) return ;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node popedNode = queue.remove();

            if(popedNode==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                System.out.print(popedNode.data+" ");
                if(popedNode.left!=null) queue.add(popedNode.left);
                if(popedNode.right!=null) queue.add(popedNode.right);
            }
        }
    }

    public static int sumOfNodes(Node root){
        if(root == null) return 0;{
            int left = sumOfNodes(root.left);
            int right = sumOfNodes(root.right);

            return left+ right + root.data;
        }
    }

    public static int totalNodes(Node root){
        if(root==null) return 0;
        else{
            int left = totalNodes(root.left);
            int right = totalNodes(root.right);

            return left+right+1;
        }
    }

    public static int findHeightRecursion(Node root){
        if(root==null) return 0;
        else{
            int left = findHeightRecursion(root.left);
            int right = findHeightRecursion(root.right);

            return Math.max(left, right)+1;
        }
    }

    

    public static void findHeight(Node root){
        if(root==null) return;
        else{
            int level=0;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curr = q.remove();
                if(curr== null){
                    level++;
                    if(q.isEmpty()){
                        break;
                    }
                    q.add(curr);
                }
                else{
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
            }
            System.out.println(level);
        }
        
    }


    public static void main(String[] args) {
        
        int[] treeData = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] treeData2 = {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        int[] treeData3 = {2,-1,3,-1,4,-1,5,-1,6,-1,7,-1,-1};


        Tree tree = new Tree();
        Node root = tree.preOrderBuildTree(treeData3);
        System.out.println("Inorder: ");
        InOrder(root);
        System.out.println("\nPostOrder");
        postOrder(root);
        System.out.println("\nPreOrder");
        preOrder(root);
        System.out.println("\nLevelOrder");
        levelOrder(root);
        System.out.println("\nHeight of this tree is using recursion "+ findHeightRecursion(root));
        System.out.print("Height of this tree using brute force method ");
        findHeight(root);
        System.out.println("Total Nodes: "+totalNodes(root));
        System.out.println("Sum of all Nodes "+sumOfNodes(root));
    }
}