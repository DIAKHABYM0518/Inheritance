//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create two person object
       Person p1 = new Person();

       //Person p2 = new Person(72, 25, "Black", "Barack Obama", 170);
       //System.out.println(p2.name);

        Person p2 = new Person( 72,  70);
        System.out.println(p2.age);

        Person p3 = p2.Call_Private();
        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);

        // Create an Instructor object
        Instructor i1 = new Instructor();

        // Assign inherited attributes
        i1.height = 72;
        i1.age = 40;
        i1.color = "Black";
        i1.name = "John Smith";
        i1.weight = 180;

        // Assign Instructor-specific attributes
        i1.department = "Computer Science";
        i1.salary = 65000;

        // Print all assigned attribute values
        System.out.println("Instructor Height: " + i1.height);
        System.out.println("Instructor Age: " + i1.age);
        System.out.println("Instructor Color: " + i1.color);
        System.out.println("Instructor Name: " + i1.name);
        System.out.println("Instructor Weight: " + i1.weight);
        System.out.println("Instructor Department: " + i1.department);
        System.out.println("Instructor Salary: $" + i1.salary);
    }
}
