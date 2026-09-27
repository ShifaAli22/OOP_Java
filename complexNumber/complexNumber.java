class complexNumber {
    private double real;
    private double imag;
    private static int count;

    public complexNumber() {
        this.real = 0;
        this.imag  = 0;
        count++;
    }

    public complexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
        count++;
    }

    public complexNumber(complexNumber c) {
        this.real = c.real;
        this.imag = c.imag;
        count++;
    }

    public static int objectCount(){
        return count;
    }

    public void set(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getreal(){
        return this.real;
    }

    public double getimag(){
        return this.imag;
    }

    public complexNumber add( complexNumber x){
        this.real = this.real + x.real ;
        this.imag = this.imag + x.imag;
        return new complexNumber (real,imag);
    }

    public complexNumber sub( complexNumber x){
        this.real = this.real - x.real ;
        this.imag = this.imag - x.imag;
    return new complexNumber (real,imag);
    }

    public complexNumber multi( complexNumber x){
        double a = (this.real * x.real) - (this.imag * x.imag);
        double b = (this.real * x.imag) + (this.imag * x.real);
        return new complexNumber (a,b);
    }

    void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Complex Number: " + real + ", " + imag + "i";
    }
}