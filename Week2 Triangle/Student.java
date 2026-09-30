import java.util.Scanner;

class Student{
    private String name;
    private int testScore1;
    private int testScore2;

    public Student (String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    }
    public String getName(){
        return this.name;
    }

    // public void inputGrades(){
    //     Scanner sc = new Scanner(System.in);
    //     this.testScore1 = sc.nextInt();
    //     this.testScore2 = sc.nextInt();
    // }

    public void inputGrades(){
        Scanner sc = new Scanner(System.in);
        this.testScore1 = sc.nextInt();
        while(0 > testScore1 && testScore1 > 100){
            System.out.println("invalid input, reenter score");
            this.testScore1 = sc.nextInt();
        }
        this.testScore2 = sc.nextInt();
        while(0 < testScore2 && testScore2 > 100){
            System.out.println("invalid input, reenter score");
            this.testScore2 = sc.nextInt();
        }
    }

    public int getAverage(){
        return (this.testScore1 + this.testScore2)/2;
    }

    // public void display(){
    //     System.out.println(this);
    // }

    public String toString(){
        return "Student name : " + this.name + "; Test # 1 = " + this.testScore1 + ", Test # 2 = " + this.testScore2;
    }

}
