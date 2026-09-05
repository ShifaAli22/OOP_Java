public class main {
    public static void main(String[] args) {
    System.out.println("class Car output");
    Car coco = new Car();
    coco.display();
    coco.on();
    coco.setBrand("ferrari");
    coco.setModel("Roma");
    coco.setColor("Pink");
    coco.setSpeed(50);
    coco.display();
    coco.changeGear(9);
    coco.changeGear(5);
    System.out.println("gear " + coco.getGear());
    coco.accelerate();
    coco.brake();

    
    System.out.println();

    System.out.println("class Calculator output");
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
