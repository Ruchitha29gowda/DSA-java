import java.util.HashSet;

public class CountUniqueSubstrings {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        Node(){
            for(int i=0; i<26; i++){
                this.children[i]=null;
            }
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
            curr = curr.children[indx];
        }

        curr.eow = true;
    }

    
    public static void usingTries(String s){

        //Create a Trie using all suffixes
        for(int i=0; i<s.length(); i++){
            insert(s.substring(i));
        }

        //Count all the Nodes
        int count = countNodes(root);
        System.out.println(count);
    }

    public static int countNodes(Node root){
        if(root==null) return 0;
        int count =0;
        for(int i=0; i<26; i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    
    //USING HASHSET
    public static void hashSet(String str){
        HashSet<String> st = new HashSet<>();
        st.add("");
        for(int i=0; i<str.length(); i++){
            String ans ="";
            for(int j=i; j<str.length(); j++){
                ans+=str.charAt(j);
                st.add(ans);
                // System.out.print(ans+" ");
            }
            // System.out.println();
        }

        System.out.println(st.size());
    }
    public static void main(String[] args) {
        String str = "ababa";
        usingTries(str);
        hashSet(str);
    }
}
