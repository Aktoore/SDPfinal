public class Main {
    public static void main(String[] args) {
        User customer = UserFactory.createUser("customer", "Maga", "Magzhan@gmail.com");
        User admin = UserFactory.createUser("admin","Admin","admin@gmail.com");

        RentalFacade rentalFacade = new RentalFacade();


        rentalFacade.registerUser(customer);
        rentalFacade.registerUser(admin);
        rentalFacade.addObserver(customer);
        rentalFacade.addObserver(customer);


        Vehicle car = new Vehicle("Camry",new Hourly(10));
        Vehicle bike = new Vehicle("PitBike", new Daily(30));


        rentalFacade.addVehicle(car);
        rentalFacade.addVehicle(bike);
        rentalFacade.bookV(car,customer, 5);
        rentalFacade.bookV(bike,admin,10);


        rentalFacade.updateVeAvai("Camry", false);
        rentalFacade.updateVeAvai("PitBike",true);

    }
}