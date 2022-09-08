//1.Create a class named 'Student' with String variable 'name' and integer
// variable 'roll_no'. Assign the value of roll_no as '2' and that of name as
//"John" by creating an object of the class Student. Then print the information.

public class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student z = new Student();
        z.name = "John";
        z.roll_no = 2;
        System.out.println(z.name);
        System.out.println(z.roll_no);
    }
}