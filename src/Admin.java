public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
        this.phone = "+7 700 000 00 01";
        this.id = "ADMIN_" + System.currentTimeMillis();
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