import java.util.Scanner;
public class Average {
    float a,b,c;
    void result(){
        System.out.println("Average = "+((a+b+c)/3));
    }
    public static void main(String[] args) {
        Average avg = new Average();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        avg.a =input.nextFloat();
        avg.b= input.nextFloat();
        avg.c =input.nextFloat();
        avg.result();
    }
}