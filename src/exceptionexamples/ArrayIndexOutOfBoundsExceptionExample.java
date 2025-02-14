package exceptionexamples;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        try {
            int arr[] = {12, 34, 2, 4, 55, 67};
            System.out.println("arr length is : " + arr.length);
            System.out.println("arr index 2 value : " + arr[2]);
            System.out.println("arr index 6 value is : " + arr[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
