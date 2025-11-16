public class UserFactory {
    public static User createUser(String type, String name, String email,String phone) {
        switch (type.toLowerCase()) {
            case "customer":
                return new Customer(name, email,phone);
            case "admin":
                return new Admin(name, email,phone);
            default:
                throw new IllegalArgumentException("Invalid user type" + type);
        }
    }
}
