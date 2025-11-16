public class Customer extends User {
    public Customer(String name, String email,String phone) {
        super(name, email,phone);
        this.id = "CUST_" + System.currentTimeMillis();
    }

    @Override
    public void register() {
        System.out.println("Customer registered: " + name);
    }
    @Override
    public String getUserType() {
        return "Customer";
    }
}