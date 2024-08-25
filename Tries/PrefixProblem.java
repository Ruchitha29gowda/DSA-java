public class PrefixProblem {

    static class Node{
        int frequency;
        Node[] children = new Node[26];
        boolean eow;

        Node(){
            for(int i=0; i<26; i++){
                this.children[i] = null;
            }
            this.frequency = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root;
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i) - 'a';
            if(curr.children[indx]==null){
                curr.children[indx] = new Node();
            }
            else{
                curr.children[indx].frequency+= 1;
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }
    
    public static void findUniquePrefix(String ans, Node root){
        if(root==null) return ;

        if(root.frequency==1){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0; i<root.children.length; i++){
            if(root.children[i]!=null){
                findUniquePrefix(ans+ (char)(i+'a'), root.children[i]);
            }
        }
    }


    public static String myLogic(String s){
        if(s.length()==0) return "";
        Node curr = root;
        String ans ="";
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i)-'a';
            if(curr.children[indx]!=null){
                if(curr.children[indx].frequency==1){
                    ans+= (char)(indx+'a');
                    return ans;
                }
                else{
                    ans+= (char)(indx+'a');
                }
            }
            curr = curr.children[indx];
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] arr = {"zebra", "dove", "dog", "duck"};
        String[] ans = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        root.frequency = -1;

        findUniquePrefix("", root);
        System.out.println();

        for(int i=0; i<arr.length; i++){
            ans[i] = myLogic(arr[i]);
            System.out.print(ans[i]+" ");
        }


    }
}
