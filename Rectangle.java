public class Rectangle {
    int side1;
    int side2;
    public void Area() {
        System.out.println("Area = " + (side1 * side2));
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.side1 = 4;
        r1.side2 = 5;
        r1.Area();
        Rectangle r2 = new Rectangle();
        r2.side1 = 5;
        r2.side2 = 8;
        r2.Area();
    }
}

