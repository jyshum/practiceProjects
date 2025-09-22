public class coordDist {
    public static void main(String[] arg) {
        System.out.print(dist(30, 10, -10, -10));
    }

    public static double dist(double x1, double x2, double y1, double y2) {
        return Math.sqrt( (Math.pow( (x2 - x1), 2) ) + (Math.pow(( y2 - y1), 2)) );
    }
}
