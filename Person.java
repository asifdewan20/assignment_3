import java.util.Scanner;
public class Person {
    String name;
    int age;
    void view() {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("First Person :");
        Person a = new Person();
        a.name =p.nextLine();
        a.age = p.nextInt();
        p.nextLine();
        System.out.println("Second Person :");
        Person a2 = new Person();
        a2.name = p.nextLine();
        a2.age = p.nextInt();
        a.view();
        a2.view();
    }
}
