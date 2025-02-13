package exceptionexamples;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a=10;
        int res =0;
        try{
            //monitor code
            System.out.println("Inside try block before exception occurs");
            res = a/0; // division by zero
            System.out.println("Inside try block after exception occurs");
        } catch (ArithmeticException e){
            // handle exception
            System.out.println("Exception occurred : "+e.getMessage());
        }
        System.out.println("a is : "+a);
        System.out.println("res is : "+res);

    }
}
