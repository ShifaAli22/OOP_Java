public class main {
    public static void main(String[] args) {
    complexNumber c1 = new complexNumber();
    complexNumber c2 = new complexNumber(3,5);
    complexNumber c3 = new complexNumber(2,2);
    System.out.println("Addition: " + c2.add(c1));
    System.out.println("Multiplication: " + c2.multi(c3));
    System.out.println(c1);
    c3.display();
    System.out.println("Object Count: " + complexNumber.objectCount());
    }
}
