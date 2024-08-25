public class LinearSearch {

    public static int find(int marks[], int key){
        for(int i = 0; i<marks.length; i++){
            if(marks[i]==key){
                return i;
            }
        }
        return-1;
    }

    public static int find(String menu[], String key){
        for(int i = 0; i<menu.length; i++){
            if(menu[i]==key){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        String menu[]= {"cake","chips","coke","noodles","rice"};
        int ind=find(menu, "cookies");
        
        if(ind==-1){
            System.out.println("DISH NOT FOUND");
        }
        else{
            System.out.println("DISH FOUND AT "+ind);
        }

        int marks[]= {1,2,3,4,5,};
        int index = find(marks, 10);
        if(index==-1){
            System.out.println("Marks NOT FOUND");
        }
        else{
            System.out.println("Marks FOUND AT "+index);
        }
    }
}
