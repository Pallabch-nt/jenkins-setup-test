public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static double divide(int a, int b) {
        if(b!=0) {
            return a/b;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("THIS IS A TEST OF THE CALCULATOR CLASS");
        System.out.println(add(2,3));
    }
}
