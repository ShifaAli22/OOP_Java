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

    public Point add(Point P){
        double dx = this.x + P.x;
        double dy = this.y + P.y;
        return new Point (dx,dy);
    }

    public double distance(Point c){
        double dx = c.x - this.x;
        double dy = c.y - this.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public boolean isAtOrigin(){
        return this.x == 0 && this.y == 0;
    }

    public int quadrant(){

        if(x > 0 && y > 0)
            return 1;
        else if(x < 0 && y > 0)
            return 2;
        else if(x < 0 && y < 0)
            return 3;
        else if(x > 0 && y < 0)
            return 4;
        else 
            return 0;
    }

    public void setx(double x){
        this.x = x;
    }

    public void sety(double y){
        this.y = y;
    }

    public double getx(){
        return this.x;
    }

    public double gety(){
        return this.y;
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