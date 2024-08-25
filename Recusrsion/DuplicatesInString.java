public class DuplicatesInString {

    public static String duplicate(String s){
        char map[] = new char[26];

        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i)-'a';
            // System.out.println(a);

            if(map[a]!=' '){
                map[a]=s.charAt(i);
                System.out.print(map[a]+" ");
            }
        }

        System.out.println();
        StringBuilder s1 = new StringBuilder("");
        for(int i=0; i<map.length; i++){
            System.out.print(map[i]+" ");
            if(map[i]!=' '){
                s1.append(map[i]);
            }
        }

        System.out.println();
        System.out.println(s1);

        return "";
    }

    public static String recursiveMethod(String s, StringBuilder s1, int indx, boolean map[]){
        if(indx==s.length()){
            return "";
        }
        else{
            char current=s.charAt(indx);
            if(map[current - 'a']==true){
                //duplicate
                recursiveMethod(s,s1,indx+1,map);
            }
            else{
                //not duplicate
                map[current - 'a']=true;
                recursiveMethod(s,s1.append(current),indx+1,map);
            }
        }

        return s1.toString();
    }


    

    public static boolean[] removeRecursion(String s, int index, boolean[] map){
        if(index==s.length()){
            return map;
        }
        else{
            if(map[s.charAt(index)-'a']==true){
                removeRecursion(s, index+1, map);
            }
            else{
                map[s.charAt(index)-'a']=true;
                removeRecursion(s, index+1, map);
            }
        }

        return map;
    }

    public static void createString(boolean[] map){
        
        StringBuilder lg = new StringBuilder();
        int character =97;
        for(int i=0; i<map.length; i++){
            if(map[i]==true){
                lg.append((char)character);
            }
            character++;
        }

        System.out.println(lg);
    }



    public static void main(String[] args) {
        // duplicate("aaabcopq");
        StringBuilder s1 = new StringBuilder("");
        boolean map[] = new boolean[26];

        // recursiveMethod("aaabssghdddd",s1, 0, map);
        // int a =97;
        // char b = (char)a;
        // System.out.println(b);

        // removeRecursion("aaghgdkssks", 0, map);
        // // createString(map);
        // duplicate("hellooo");

        System.out.println(recursiveMethod("hellooo", s1, 0, map));;
    }
}
