import java.util.Scanner;
public class Area {
    int length, breadth;
    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }
    void getArea() {
        System.out.println("Area = " + (length * breadth));
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Area z = new Area();
        System.out.println("Enter Length & Breadth :");
        z.setDim(data.nextInt(), data.nextInt());
        z.getArea();
    }
}