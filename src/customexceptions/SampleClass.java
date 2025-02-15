package customexceptions;

public class SampleClass {
    public static void main(String[] args) {
        try{
            int a=10;
            if(a==10){
                throw new UserErrorException("Some user error exception occurred and this is custom exception");
            }
        } catch (Exception e){
            System.out.println("exception occured : "+e.getMessage());
        }


        try{
            boolean customerFromDb = false;
            if(customerFromDb==false){
                throw new CustomerNotFoundException("customer could not be found in database");
            }
        } catch (Exception e) {
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
