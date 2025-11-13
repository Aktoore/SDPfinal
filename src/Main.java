import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalFacade facade = new RentalFacade();

        users.put("admin@gmail.com", UserFactory.createUser("admin", "Admin", "admin@gmail.com"));

        Vehicle car = VehicleFactory.createVehicle("car", "Camry", new Hourly(10));
        Vehicle bike = VehicleFactory.createVehicle("bike", "Yamaha", new Daily(30));
        Vehicle van = VehicleFactory.createVehicle("van", "Sprinter", new Hourly(15));
        facade.addVehicle(car);
        facade.addVehicle(bike);
        facade.addVehicle(van);

        while(true) {
            System.out.println("\n1. Register 2. Login 3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();

                if (users.containsKey(email)) {
                    System.out.println("Email already exists!");
                    continue;
                }
                System.out.print("Notification (1-Email, 2-SMS): ");
                int notification = sc.nextInt();
                sc.nextLine();

                User user = UserFactory.createUser("customer", name, email);
                facade.registerUser(user);
                facade.addObserver(user);
                users.put(email, user);

                System.out.println("User registered!");

                }
            else if (choice == 2) {
                System.out.print("Email: ");
                String email = sc.nextLine();

                if (!users.containsKey(email)) {
                    System.out.println("User not found!");
                    continue;
                }

                User user = users.get(email);
                System.out.print("Welcome, " + user.getName() + "!");

                while (true) {
                    System.out.print("\n1. View vehicles 2. Book 3. Logout ");
                    System.out.print("Enter your choice: ");
                    int action = sc.nextInt();
                    sc.nextLine();

                    if (action == 1) {
                        System.out.print("1. Camry [" + (car.isAvailable() ? "Available" : "Booked") + "]");
                        System.out.print("2. Yamaha [" + (bike.isAvailable() ? "Available" : "Booked") + "]");
                        System.out.print("3. Sprinter [" + (van.isAvailable() ? "Available" : "Booked") + "]");

                    } else if (action == 2) {
                        System.out.println("Vehicler (1-Camry, 2-Yamaha, 3-Van): ");
                        int vehicle = sc.nextInt();
                        System.out.print("Duration: ");
                        int duration = sc.nextInt();
                        sc.nextLine();

                        Vehicle selected = null;
                        if (vehicle == 1) selected = car;
                        else if (vehicle == 2) selected = bike;
                        else if (vehicle == 3) selected = van;

                        if (selected != null) {
                            facade.bookV(selected, user, duration);
                        } else {
                            System.out.println("Vehicle not found!");
                        }
                } else if (action == 3) {
                        break;
                    }
            }

            } else if (choice == 3) {
                System.out.print("Goodbye!");
                break;
            }

        }
        sc.close();

    }
}