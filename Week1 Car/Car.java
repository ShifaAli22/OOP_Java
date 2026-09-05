public class Car{
    String brand;
    String model;
    String color;
    int speed;
    int gear;
    boolean key;

    public Car(){
        this.brand = "";
        this.model = "";
        this.color = "";
        this.speed = 0;
        this.gear = 0;
        this.key = false;
    }

    public Car(String brand, String model, String color, int speed, int gear, boolean key){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        this.key = key;
    }

    public Car(Car c){
        this.brand = c.brand;
        this.model = c.model;
        this.color = c.color;
        this.speed = c.speed;
        this.gear = c.gear;
        this.key = c.key;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
        autoGear();
    }

    public void setGear(int gear){
        this.gear = gear;
    }

    public void setKey(boolean key){
        this.key = key;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String getColor(){
        return this.color;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getGear(){
        return this.gear;
    }

    public Boolean getKey(){
        return this.key;
    }

    public void on(){
        this.key = true;
        display();
    }

    public void off(){
        this.key = false;
        brake();
    }

    public void accelerate(){
        this.speed = speed + 10;
        autoGear();
        display();
    }

    public void changeGear(int newGear){
    if (newGear >= 0 && newGear <= 5) {
        gear = newGear;
    }else{
        System.out.println("invalid gear");
    }
    display();
    }

    public void brake(){
        while (this.speed > 0){
            this.speed = speed - 10;
            autoGear();
    }
    display();
    }

    public void autoGear(){
        if (this.speed == 0){
            this.gear = 0;
        }else if (this.speed <= 20){
            this.gear = 1;
        } else if (this.speed <= 40){
            this.gear = 2;
        }else if (this.speed <= 60){
            this.gear = 3;
        }else if (this.speed <= 80){
            this.gear = 4;
        }else if (this.speed <= 100){
            this.gear = 5;
        }
    }

    public void display(){
        System.out.println("Car: Brand = " + this.brand + ", Model = " + this.model + ", Color = " + this.color + ", Speed = " + this.speed + ", Gear = " + this.gear + ", Key = " + this.key);
    }

    @Override
    public String toString(){
        return "Car: Brand = " + this.brand + ", Model = " + this.model + ", Color = " + this.color + ", Speed = " + this.speed + ", Gear = " + this.gear + ", Key = " + this.key;
    }
}