public class LexicoGraphic {

    //Print the largest string in accordance with the char
    public static void largestString(String fruits[]){
         String largest = fruits[0];

         for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
         }

         System.out.println(largest);
    }


    public static void main(String[] args) {
        String fruits[]={"mango", "banana","apple"};
        largestString(fruits);
        
    }
}
