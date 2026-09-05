public class Point{
    private double x;
    private double y;
    private static int count;

    public Point(){
        this.x = 1.0;
        this.y = 1.0;      
        count++;  
    }

    public Point(double x , double y){
        this.x = x;
        this.y = y;
        count++;
    }

    public Point(Point c){
        this.x = c.x;
        this.y = c.y;
        count++;
    }

    public void setx(double x){
        this.x = x;
        count++;
    }

    public void sety(double y){
        this.y = y;
        count++;
    }

    public double getx(){
        return this.x;
        count++;
    }

    public double gety(){
        return this.y;
        count++;
    }

    public static int objectCount(){
        return count;
    }

    public void display(){
        System.out.println("point x: " + this.x + ", point y: " + this.y);
    }

    @Override
    public String toString(){
        return "point x: " + this.x + ", point y: " + this.y;
    }
}