public class MathFunctions {
    static double PI;
    static double e;

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
}
