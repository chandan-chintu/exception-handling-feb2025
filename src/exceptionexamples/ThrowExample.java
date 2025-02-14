package exceptionexamples;

public class ThrowExample {
    public static void sample() {
        System.out.println("sample method before throwing an exception");
        int a = 10;
        if (a == 10) {
                throw new RuntimeException("Some exception occurred");
        }

        // findcustomer with name sanjay in database
        // if customer found then return the data
        // if customer not found we have handle the scenario

//        if(customerFromDatabase == null){
//            throw new CustomerNotFoundException("no customer present with given name");
//        }

        System.out.println("a is :"+a);
    }
    public static void main(String[] args) {
        try{
            ThrowExample.sample();
        }catch (Exception e){
            System.out.println("exception occurred : "+e.getMessage());
        }
    }
}
