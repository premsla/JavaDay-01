public class Var{
    static int a = print("static variable a");
    static {
        System.out.println("static block");
    }
    static int b = print("static variable b");
    static int print(String msg) {
        System.out.println(msg);
        return 10;
    }
    public static void main(String[] args) {

    }
}