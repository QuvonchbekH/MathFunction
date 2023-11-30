import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MathFunctions.PI = input.nextDouble();
        MathFunctions.e = input.nextDouble();

        System.out.println(MathFunctions.doira(10));
        System.out.println(MathFunctions.MathPow(6));
        System.out.println(MathFunctions.Shape(3, 4, 5));
    }
}