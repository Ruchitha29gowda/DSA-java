public class LongestWordWithAllPrefixes {
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

    public static String ans = "";

    public static void longestWord(Node root, String str){
        if(root==null) return;
        for(int i=0; i<26; i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                str+=(char)(i+'a');
                if(str.length()>ans.length()){
                    ans = str;
                }
                longestWord(root.children[i], str);
                str = str.substring(0,str.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWord(root, "");
        System.out.println(ans);
       
    }
}
