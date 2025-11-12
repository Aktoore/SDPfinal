public class UserFactory {
    public static User createUser(String type, String name, String email) {
        switch (type.toLowerCase()) {
            case "customer":
                return new Customer(name, email);
            case "admin":
                return new Admin(name, email);
            default:
                throw new IllegalArgumentException("Invalid user type" + type);
        }
    }
}
