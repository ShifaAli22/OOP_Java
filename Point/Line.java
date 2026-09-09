class Line{
private Point A;
private Point B;
private static int count;

public Line(){
this.A = new Point(0,0);
this.B = new Point (0,0);
count++;
}

public Line(Point A, Point B){
this.A = new Point (A);
this.B = new Point (B);
count++;
}

public Line(Line c){
this.A = new Point (c.A);
this.B = new Point  (c.B);
count++;
}

public static int objectCount(){
return count;
}

public void setA(Point A){
this.A = new Point (A);
}

public void setB(Point B){
this.B = new Point (B);
}

public Point getA(){
return this.A;
}

public Point getB(){
return this.B;
}

public double length(Point p,Point q){
double dx = q.getx() - p.getx();
double dy = q.gety() - p.gety();
return Math.sqrt(dx * dx + dy * dy);
}

public Point midpoint() {
double mx = (A.getx() + B.getx()) / 2;
double my = (A.gety() + B.gety()) / 2;
return new Point(mx, my);
}

public boolean isHorizontal(){
return A.getx() == B.getx();
}

public boolean isVertical(){
return A.gety() == B.gety();
}

public void display(){
System.out.println(this);
}

public String toString(){
return "Line : Point A = " + A + ", Point B = "+ B;
}
}