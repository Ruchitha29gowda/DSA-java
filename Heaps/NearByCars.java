import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NearByCars {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distanceSq;
        int indx;

        Point(int x, int y, int indx){
            this.x = x;
            this.y = y;
            this.distanceSq = (int)(Math.pow(x, 2)+ Math.pow(y, 2));
            this.indx = indx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distanceSq - p2.distanceSq;
        }
    }

    public static void usingPQ(int[][] pts, int k){
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            pq.add(new Point(pts[i][0], pts[i][1] , i));
        }

        for(int i=0; i<k; i++){
            System.out.println(pq.remove().indx);
        }

    }

    public static ArrayList<Integer> findNearCars(int[][] pts, int k){
        ArrayList<Integer> list = new ArrayList<>();
        Integer[][] newPts = new Integer[pts.length][2];
        for(int i=0; i<pts.length; i++){
            newPts[i][0]=i;
            newPts[i][1]= (int)(Math.pow(pts[i][0], 2) + Math.pow(pts[i][1], 2));
        }

        Arrays.sort(newPts, Comparator.comparingDouble(o -> o[1]));
        
        int i=0;
        while(i<k){
            list.add(newPts[i][0]);
            i++;
        }
        return list;

    }

    public static void main(String[] args) {
        int pts[][] = {
            {3,3},
            {5,-1},
            {-2,4}
        };

        ArrayList<Integer> list =  findNearCars(pts, 2);

        for(int i=0; i<list.size(); i++){
            System.out.println(pts[list.get(i)][0]+" "+ pts[list.get(i)][1]);
        }
        System.out.println("\n");

        usingPQ(pts, 2);
    }
}