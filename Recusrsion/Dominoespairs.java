import java.util.Arrays;

public class Dominoespairs {

    public static int numEquivDominoPairs(int[][] dominoes) {
        int count =0;
        for(int i = 0; i<dominoes.length; i++){
            Arrays.sort(dominoes[i]);
            for(int j=i+1; j<dominoes.length; j++){
                Arrays.sort(dominoes[j]);
                if(dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]){
                    count++;
                }
                else continue;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        int [][] m = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        System.out.println(numEquivDominoPairs(m));;
    }
}
