import java.util.Scanner;

public class MathFunctions {
    static double PI=3.14;
    static double e=2.7;
    public int number = 1_000_000;
    static{
        double S = doira(3);
        double Pow = MathPow(5);
        if (S>Pow){
            System.out.println("Yuza");
        }
        else System.out.println("Daraja");
    }

    static double doira(int r){
        double S = PI* Math.pow(r, 2);
        return S;
    }
    static double MathPow(int a){
        double Result = Math.pow(e, a);
        return Result;
    }
    static float Shape(int a, int b, int c){
        float p = (a + b + c)/2;
        float S = (float)(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        return S;
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            MathFunctions mathFunctions = new MathFunctions();
//            MathFunctions.PI = input.nextDouble();
//            MathFunctions.e = input.nextDouble();

            System.out.println(doira(10));
            System.out.println(MathPow(6));
            System.out.println(Shape(3, 4, 5));
        }
    }