import java.util.HashMap;

public class ValidAnagram {

    public static boolean isValid(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c1 = s1.toCharArray(); 
        char[] c2 = s2.toCharArray(); 


        for(int i=0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(c1[i], map.get(c1[i])+1);
            }
            else{
                map.put(c1[i], 1);
            }
        }

        System.out.println(map);

        for(int i=0; i<c2.length; i++){
            if(map.containsKey(c2[i])){
                map.put(c2[i], map.get(c2[i])-1);

                if(map.get(c2[i])==0){
                    map.remove(c2[i]);
                }
            }
            else{
                return false;
            }
        }
        if(map.isEmpty()) return true;

        return false;
    }
    

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        System.out.println(isValid(s1, s2));
    }
}
