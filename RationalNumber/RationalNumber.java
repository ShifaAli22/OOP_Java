class RationalNumber{
private int numerator;
private int denominator;

public RationalNumber(){
this.numerator = 0;
this.denominator = 0;
}

public RationalNumber(int numerator, int denominator){
this.numerator = numerator;
this.denominator = denominator;
}

public RationalNumber(RationalNumber c){
this.numerator = c.numerator;
this.denominator = c.denominator;
}

public void set(int numerator, int denominator){
this.numerator = numerator;
this.denominator = denominator;
}

public int getnum(){
return this.numerator;
}

public int getden(){
return this.denominator;
}

public RationalNumber Add(RationalNumber x){
int numerator = (this.numerator * x.denominator) + (this.denominator * x.numerator);
int denominator = this.denominator * x.denominator;
return new RationalNumber(numerator, denominator);

}

public RationalNumber Sub(RationalNumber x){
int numerator = (this.numerator * x.denominator) - (this.denominator * x.numerator);
int denominator = this.denominator * x.denominator;
return new RationalNumber(numerator, denominator);

}

public RationalNumber Multiply(RationalNumber x){
int numerator = this.numerator * x.numerator;
int denominator = this.denominator * x.denominator;
return new RationalNumber(numerator, denominator);
}

public RationalNumber Divide(RationalNumber x){
if (x.numerator == 0 && x.denominator == 0 && this.denominator == 0) {
System.out.println("Invalid.");
return new RationalNumber();
}
int numerator = this.numerator * x.denominator;
int denominator = this.denominator * x.numerator;
return new RationalNumber(numerator, denominator);
}

public RationalNumber reciprocate() {
return new RationalNumber(denominator, numerator);
}

public boolean equals (RationalNumber other){ 
    return other != null && this.numerator == other.numerator && this.denominator == other.denominator;
}

public int GCDiterate(){
while (this.denominator > 0){
int temp = this.denominator;
this.denominator = this.numerator%this.denominator;
this.numerator = temp;
}
return this.numerator;
}


public int GCDiterate(int a, int b){
while (b > 0){
int temp = b;
b = a%b;
a = temp;
}
return a;
}

@Override
public String toString(){
return "Rational number: " + numerator + "/" + denominator;
}

public void display(){
System.out.println(this);
}
}