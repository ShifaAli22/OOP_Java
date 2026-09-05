public class main {
    public static void main(String[] args){
        Point P = new Point();
        Point P1 = new Point(3,4);
        Point P2 = new Point(P1);
        P.display();
        P2.display();
    }
}
