public class main {
    public static void main(String[] args){
        Point P = new Point();
        Point P1 = new Point(3,2);
        Point P2 = new Point(P1);
        Point P3 = new Point(6,7);
        Point P4 = new Point(3,9);
        P.display();
        P2.setx(9);
        P2.sety(3);
        P2.display();
        System.out.println(P);
        System.out.println("Object Count = " + Point.objectCount());
        System.out.println("distance between Point P and P2 = " + P.distance(P2));
        System.out.println("Point P lies at Quadrant " + P.quadrant());
        System.out.println(P.isAtOrigin());
        System.out.println("Addition: " + P2.add(P4));
    }
}
