package classroom.web11_26_19.freemarker;

public class Calc {
   public static int add(int a, int b){
        return a+b;
    }
    public static int subt(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
       if (b!=0) {
           return a/b;
       }
       return 0.0;
    }


}
