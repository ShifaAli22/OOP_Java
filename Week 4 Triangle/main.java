public class main {
    public static void main(String[] args){
        System.out.println("point main");
        System.out.println();

        Point P = new Point();
        Point P1 = new Point(3,2);
        Point P2 = new Point(P1);
        Point P3 = new Point(6,7);
        Point P4 = new Point(3,9);
        P.display();
        P2.setx(9);
        P2.sety(3);
        P2.display();
        System.out.println(P3);
        System.out.println("Object Count = " + Point.objectCount());
        System.out.println("distance between Point P and P2 = " + P.distance(P2));
        System.out.println("Point P lies at Quadrant " + P.quadrant());
        System.out.println(P.isAtOrigin());
        System.out.println("Addition: " + P2.add(P4));

        System.out.println();
        System.out.println("line main");
        System.out.println();

        Point lp1 = new Point(5,0);
        Point lp2 = new Point(2,8);
        Point lp3 = new Point(1,4);
        Point lp4 = new Point(9,3);

        Line L1 = new Line(lp1, lp2);
        L1.display();
        Line L2 = new Line(lp3, lp4);
        System.out.println("Midpoint of line 2 : " + L2.midpoint());
        System.out.println(L2);
        Line L3 = new Line(L1);
        L3.display();
        System.out.println("is L1 vertical: " + L1.isVertical());

        System.out.println();
        System.out.println("TrianglePoint main");
        System.out.println();

        Point tp1 = new Point();
        Point tp2 = new Point(5,0);
        Point tp3 = new Point(3,9);

        TrianglePoint t1 = new TrianglePoint(tp1, tp2, tp3);
        t1.display();

        TrianglePoint t2 = new TrianglePoint(t1);
        t2.display();

        System.out.println();
        System.out.println("CirclePoint main");
        System.out.println();

        Point cp1 = new Point(5,9);
        PointCircle c1 = new PointCircle(cp1, 2);
        PointCircle c2 = new PointCircle(c1);
        c1.calculateDiameter();
        c2.calculateArea();
        c1.display();
        System.out.println(c2);
    }
}
