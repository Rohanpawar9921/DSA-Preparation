public class shortestPath {

    public static float  findShortestPath(String s) {
        float length = 0;
        float width = 0;

        for (int i= 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                length--;
            }
            else if (s.charAt(i) == 'E') {
                length++;
            }
            else if (s.charAt(i) == 'N'){
                width++;
            }
            else{
                width--;
            }
        }
        float result = (float) Math.sqrt((length*length) + (width*width));
        return result;

    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println("Shortest path is : "+ findShortestPath(s));
    }
}