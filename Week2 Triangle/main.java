public class main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(2);
        Triangle t3 = new Triangle(3,5);
        Triangle t4 = new Triangle(6,7,4);
        Triangle t5 = new Triangle(t3);
        System.out.println("total Objects = " + Triangle.objectCount());
        System.out.println("Perimewrter of triangle 4 = " + t4.perimeter());
        t3.SetsideB(4);
        System.out.println("Is triangle 3 a right angle triangle?\n" + t3.isRightAngle());
        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        System.out.println("sideA = " + t1.getsideA());
        t1.Set(2.3, 3.2, 5.0);
        System.out.println("side A " + t1.getsideA() + " side B " + t1.getsideB() + " side C " + t1.getsideC());
    }
}