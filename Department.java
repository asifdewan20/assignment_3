import java.util.Scanner;
public class Department {
    String deptName;
    int deptCode;
    String faculty;
    void display() {
        System.out.println("Department Name : " + deptName);
        System.out.println("Department Code : " + deptCode);
        System.out.println("Faculty : " + faculty);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Department d1 = new Department();
        d1.deptName = data.nextLine();
        d1.deptCode = data.nextInt();
        d1.faculty = data.next();
        d1.display();
        data.nextLine();
        Department d2 = new Department();
        d2.deptName = data.nextLine();
        d2.deptCode = data.nextInt();
        d2.faculty = data.next();
        d2.display();
    }
}

