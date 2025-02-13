package exceptionexamples;

public class DemoClass {
    public static void main(String[] args) {
    // this example shows the exception unhandled case

        int a=10;
        int res = a/0;
        System.out.println("a is : "+a);
        System.out.println("res is : "+res);
    }
}
