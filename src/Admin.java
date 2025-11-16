public class Admin extends User {
    public Admin(String name, String email,String phone) {
        super(name, email,phone);
        this.id = "ADMIN_" + System.currentTimeMillis();
        this.password = "admin123";
    }

    @Override
    public void register() {
        System.out.println("Registered Admin: " + name);
    }
    @Override
    public String getUserType() {
        return "Admin";
    }
}