public class Grades{
    public static void main(String[] args){
        Student Student1 = new Student("Joe");
        Student Student2 = new Student ("Sara");
        Student1.inputGrades();
        // Student1.display();
        System.out.println("Joe average is " + Student1.getAverage());
        Student2.printName();
        System.out.println("Student number 1 name : " + Student1.getName());
        System.out.println("Student1 " + Student1);
 }
}
