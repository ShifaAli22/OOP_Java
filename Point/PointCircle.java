class PointCircle {
private Point center;
private double radius;
private double diameter;
private double area;
private static int count;

public PointCircle(){
this.center = new Point();
this.radius = 1;
this.diameter = 0;
this.area = 0;
count++;
}

public PointCircle(Point center, double radius){
this.center = new Point(center);
this.radius = radius;
this.diameter = 0;
this.area = 0;
count++;
}

public PointCircle(PointCircle c){
this.center = new Point(c.center);
this.radius = c.radius;
this.diameter = c.diameter;
this.area = c.area;
count++;
}

public void set(Point center, double radius){
this.center = new Point(center);
this.radius = radius;
}

public void setcenter(Point center){
this.center = new Point(center);
}

public void setradius(double radius){
this.radius = radius;
}

public Point getcenter(){
return this.center;
}

public double getradius(){
return this.radius;
}

public double getdiameter(){
return this.diameter;
}

public double getarea(){
return this.area;
}

public void calculateDiameter(){
count++;
this.diameter = 2 * this.radius;
}

public void calculateArea(){
count++;
this.area = Math.PI * this.radius * this.radius;
}

public static int ObjectCount(){
return count;
}

public void display(){
System.out.println(this);
}

@Override
public String toString(){
return "Circle: center = " + center +"\nradius = " + radius +"\ndiameter = " + diameter +"\narea = " + area;
}
}