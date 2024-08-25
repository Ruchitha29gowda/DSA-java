public class ShortestPath {

    public static void shortestPath(String path){
        int x=0;
        int y=0;

        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='E'){
                x++;
            }else if(path.charAt(i)=='W'){
                x--;
            }else if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='S'){
                y--;
            }
        }

        double sp = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
        int shortPath = (int)sp;
        System.out.println(shortPath);
    }


    public static void main(String[] args) {
        String path = "WNEENESENNN";
        String path2 ="NS";
        shortestPath(path);
        shortestPath(path2);
    }
}
