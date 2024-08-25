import java.util.ArrayList;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.util.ULocale;

public class EkMachli {

    // Create a Translate object.
    Translate translate = TranslateOptions.getDefaultInstance().getService();

    
    public static void ekMachli(int N, int k){

        ArrayList<String> lines = new ArrayList<>();
        lines.add("null");//empty string at 0th index
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                lines.add("Ek Machli");
            }
            for(int j=1; j<=i; j++){
                lines.add("Pani main gayi");
            }
            for(int j=1; j<=i; j++){
                lines.add("Chapaak!");
            }
        }

        System.out.println(lines.get(k));
    }

    public static void main(String[] args) {
        int N=5, K=5;
        ekMachli(N, K);
    }
}
