public class TrianglePoint {
    private Point A;
    private Point B;
    private Point C;
    private static int count;

    public TrianglePoint(){
        this.A = new Point ();
        this.B = new Point ();
        this.C = new Point ();
        count++;
    }

    public TrianglePoint(Point A, Point B, Point C){
        this.A = new Point (A);
        this.B = new Point (B);
        this.C = new Point (C);
        count++;
    }

    public TrianglePoint ( TrianglePoint c){
        this.A = new Point (c.A);
        this.B = new Point (c.B);   
        this.C = new Point (c.C);
        count++;
    }

    public static int objectCount(){
        return count;
    }

    public void set(Point A, Point B, Point C){
        this.A = new Point (A);
        this.B = new Point (B);
        this.C = new Point (C);
    }

    public Point getA() {
        return this.A;
    }

    public Point getB() {
        return this.B;
    }

    public Point getC() {
        return this.C;
    }

    public double perimeter() {
    return this.A.distance(this.B) + this.B.distance(this.C) + this.C.distance(this.A);
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Triangle: A = " + A + ", B = " + B + ", C = " + C;
    }
}