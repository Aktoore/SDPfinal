import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, User> users = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalFacade facade = new RentalFacade();
        
        // Создаем админа
        users.put("admin@gmail.com", UserFactory.createUser("admin", "Admin", "admin@gmail.com"));
        
        // СОЗДАЕМ ТРАНСПОРТ С BRIDGE ПАТТЕРНОМ (цвет и топливо)
        Vehicle car = VehicleFactory.createVehicle("car", "Toyota Camry", 
            new Hourly(10), new Petrol(), new RedColor());
        
        Vehicle bike = VehicleFactory.createVehicle("bike", "Yamaha R1", 
            new Daily(30), new Electric(), new BlueColor());
        
        Vehicle van = VehicleFactory.createVehicle("van", "Mercedes Sprinter", 
            new Hourly(15), new Diesel(), new BlackColor());
        
        // ДОБАВЛЯЕМ DECORATOR ПАТТЕРН (дополнительные услуги)
        Vehicle decoratedCar = new GPSDecorator(
            new InsuranceDecorator(car, 0.1), 2.0);
        
        Vehicle decoratedVan = new ChildSeatDecorator(
            new GPSDecorator(van, 3.0), 15.0);
        
        // Добавляем транспорт в систему
        facade.addVehicle(decoratedCar);
        facade.addVehicle(bike);
        facade.addVehicle(decoratedVan);
        
        System.out.println("=== VEHICLE RENTAL SYSTEM WITH BRIDGE & DECORATOR ===");
        
        while(true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Register");
            System.out.println("2. Login"); 
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                // Регистрация
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                
                if (users.containsKey(email)) {
                    System.out.println("Email already exists!");
                    continue;
                }
                
                User user = UserFactory.createUser("customer", name, email);
                facade.registerUser(user);
                facade.addObserver(user);
                users.put(email, user);
                System.out.println("User registered successfully!");
                
            } else if (choice == 2) {
                // Логин
                System.out.print("Email: ");
                String email = sc.nextLine();
                
                if (!users.containsKey(email)) {
                    System.out.println("User not found!");
                    continue;
                }
                
                User user = users.get(email);
                System.out.println("Welcome, " + user.getName() + "!");
                
                // Меню пользователя
                while (true) {
                    System.out.println("\n=== USER MENU ===");
                    System.out.println("1. View vehicles");
                    System.out.println("2. Book vehicle");
                    System.out.println("3. Logout");
                    System.out.print("Enter your choice: ");
                    
                    int action = sc.nextInt();
                    sc.nextLine();
                    
                    if (action == 1) {
                        // Просмотр транспорта с информацией о Bridge (цвет и топливо)
                        System.out.println("\n=== AVAILABLE VEHICLES ===");
                        System.out.println("1. " + decoratedCar.getModel() + 
                            " [" + (decoratedCar.isAvailable() ? "Available" : "Booked") + "]" +
                            " | Type: Car" +
                            " | Fuel: " + decoratedCar.getFuelInfo() +
                            " | Color: " + decoratedCar.getColorInfo() +
                            " | Base Price: $" + decoratedCar.getPriceTotal(1) + "/hour");
                        
                        System.out.println("2. " + bike.getModel() + 
                            " [" + (bike.isAvailable() ? "Available" : "Booked") + "]" +
                            " | Type: Bike" + 
                            " | Fuel: " + bike.getFuelInfo() +
                            " | Color: " + bike.getColorInfo() +
                            " | Base Price: $" + bike.getPriceTotal(24) + "/day");
                        
                        System.out.println("3. " + decoratedVan.getModel() + 
                            " [" + (decoratedVan.isAvailable() ? "Available" : "Booked") + "]" +
                            " | Type: Van" +
                            " | Fuel: " + decoratedVan.getFuelInfo() +
                            " | Color: " + decoratedVan.getColorInfo() +
                            " | Base Price: $" + decoratedVan.getPriceTotal(1) + "/hour");
                            
                    } else if (action == 2) {
                        // Бронирование
                        System.out.println("\n=== BOOK VEHICLE ===");
                        System.out.println("Select vehicle (1-Camry, 2-Yamaha, 3-Sprinter): ");
                        int vehicleChoice = sc.nextInt();
                        System.out.print("Duration (hours): ");
                        int duration = sc.nextInt();
                        sc.nextLine();
                        
                        Vehicle selected = null;
                        if (vehicleChoice == 1) selected = decoratedCar;
                        else if (vehicleChoice == 2) selected = bike;
                        else if (vehicleChoice == 3) selected = decoratedVan;
                        
                        if (selected != null) {
                            facade.bookV(selected, user, duration);
                        } else {
                            System.out.println("Invalid vehicle selection!");
                        }
                        
                    } else if (action == 3) {
                        break;
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                
            } else if (choice == 3) {
                System.out.println("Thank you for using Vehicle Rental System!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        
        sc.close();
    }
}