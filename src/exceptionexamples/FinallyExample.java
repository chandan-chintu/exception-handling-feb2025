package exceptionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        int a=10;
        int res =0;
        try{
            System.out.println("Inside try block before exception occurs");
            res = a/10; // division by zero
            System.out.println("Inside try block after exception occurs");
        } catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}
