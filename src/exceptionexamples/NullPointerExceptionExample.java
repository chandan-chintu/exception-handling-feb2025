package exceptionexamples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String msg1 = "hi hello";
            String msg2 = null;
            System.out.println("length of msg1 : " + msg1.length());
            System.out.println("length of msg2 : " + msg2.length());
        }catch (NullPointerException e){ // when some variable/object is null and some operation is performed on it, it will give NullPointerException
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
