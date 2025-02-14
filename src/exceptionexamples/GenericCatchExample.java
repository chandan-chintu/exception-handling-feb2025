package exceptionexamples;

public class GenericCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            int a =10;
            int res=a/10;
            System.out.println("res is :"+res);
            String msg1 ="hi";
            String msg2="hello";
            System.out.println("msg1 length is : "+msg1.length());
            System.out.println("msg2 length is : "+msg2.length());
            int arr[]={23,23,12};
            System.out.println("length of array a is :"+arr.length);
            System.out.println("a index 5 is :"+arr[5]);
            System.out.println("After try block");
        } catch (Exception e){
            System.out.println("exception occurred : "+e.getMessage());
        }
    }
}
