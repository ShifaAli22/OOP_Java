public class main {
    public static void main(String[] args) {
     Calculator casio = new Calculator();
     Calculator citizen = new Calculator(4,8,0);
         casio.add(2, 5);
         casio.sub(2, 2);
         casio.multi(4, 10);
         casio.div(15, 3);
         citizen.display();
        System.out.println("A = " + citizen.getA());
    }
}
