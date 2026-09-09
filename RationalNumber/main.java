public class main {
public static void main(String[] args) {
    RationalNumber R1 = new RationalNumber();
    RationalNumber R2 = new RationalNumber(7,9);
    RationalNumber R3 = new RationalNumber(2,5);
    RationalNumber R4 = new RationalNumber(R2);
    System.out.println(R1);
    R2.display();
    R3.display();

    System.out.println("Addition: " + R1.Add(R2));
    System.out.println("Subtraction: "+ R3.Sub(R2));
    System.out.println("Multiplication: " + R2.Multiply(R4));
    System.out.println("Division: "+ R2.Divide(R3));
    System.out.println(R2.reciprocate());
    System.out.println(R4.equals(R2));
    System.out.println("gcd of R2: " + R2.GCDiterate());
}
}

