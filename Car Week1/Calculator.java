class Calculator {
    private int A;
    private int B;
    private int result;

    public Calculator(){
        this.A = 0;
        this.B = 0;
        this.result = 0;
    }

    public Calculator(int A, int B, int result){
        this.A = A;
        this.B = B;
        this.result = result;
    }
    
    public void add(int A , int B){
        System.out.println("Adding");
        this.A = A;
        this.B = B;
        this.result= A+B;
        display();
    }

    public void sub(int A , int B){
        System.out.println("subtracting");
        this.A = A;
        this.B = B;
        this.result= A-B;
        display();
    }

    public void multi(int A , int B){
        System.out.println("multiplying");
        this.A = A;
        this.B = B;
        this.result= A*B;
        display();
    }

    public void div(int A , int B){
        System.out.println("dividing");
        this.A = A;
        this.B = B;
        this.result= A/B;
        display();
    }

    public void set (int A, int B, int result){
        this.A = A;
        this.B = B;
        this.result = result; 
    }

    public int getA (){
        return this.A;
    }

    public int getB(){
        return this.B;
    }

    public int getresult(){
        return this.result;
    }

    public void display(){
        System.out.println("number 1 = " + A);
        System.out.println("number 2 = " + B);
        System.out.println("result = " + result);
    }

    @Override
    public String toString(){
        return "number 1 = " + this.A + "number 2 = " + this.B + "Result = " + 
    }
}
