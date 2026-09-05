class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    private static int count;

    public Triangle(){
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        count++;
    }

    public Triangle (double x){
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
        count++;
    }

    public Triangle (double x, double y){
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        count++;
    }

    public Triangle (double x, double y, double z){
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        count++;
    }

    public Triangle (Triangle t){
        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;
        count++;
    }

    public static int objectCount(){
        return count;
    }

    public double perimeter(){
        return this.sideA + this.sideB + this.sideC;
    } 

    public boolean isRightAngle(){
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC;
    }

    public void Set(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void SetsideA(double sideA){
        this.sideA = sideA;
    }

    public void SetsideB(double sideB){
        this.sideB = sideB;
    }

    public void SetsideC(double sideC){
        this.sideC = sideC;
    }

    public double getsideA(){
        return this.sideA;
    }

    public double getsideB(){
        return this.sideB;
    }

    public double getsideC(){
        return this.sideC;
    }

    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        return "Triangle: sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC;
    }
}
