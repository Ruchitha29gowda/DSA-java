import java.util.LinkedList;
import java.util.Queue;

public class Revision {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int indx =-1;
    public static Node buildTree(int nodes[]){
        indx++;
        if(nodes[indx]==-1){
            return null;
        }
        Node root = new Node(nodes[indx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q  = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if(curNode==null){
                System.out.println();
                if(q.isEmpty()) return;
                else q.add(null);
            }
            else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
        }
    }

    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+"    ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int Height(Node root){
        if(root==null) return 0;
        int lh = Height(root.left);
        int rh = Height(root.right);

        return Math.max(lh, rh)+1;
    }

    public static int CountNodes(Node root){
        if(root==null) return 0;
        int lc = CountNodes(root.left);
        int rc = CountNodes(root.right);
        return lc + rc +1;
    }

    public static int SumNodes(Node root){
        if(root==null) return 0;
        return SumNodes(root.left) + SumNodes(root.right) + root.data;
    }

    public static int diameter(Node root){
        if (root == null) return 0;
        int lh = Height(root.left);
        int rh = Height(root.right);

        int left_d = diameter(root.left);
        int right_d = diameter(root.right);


        int selfDiameter = lh + rh +1;

        return Math.max(selfDiameter, Math.max(left_d, right_d));
    }


    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        levelOrder(root);
        // System.out.println(root.data);

        // preOrder(root);
        // System.out.println(Height(root));
        // System.out.println(CountNodes(root));
        // System.out.println(SumNodes(root));

        System.out.println(diameter(root));




    }
}
