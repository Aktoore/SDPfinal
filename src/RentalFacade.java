public class RentalFacade {
    private Rental rental = new Rental();
    private NotificationFacade notificationFacade = new NotificationFacade();


    public void addObserver(User user)
    {
        rental.addObserver(new UserObserver(user.getName()));
    }

    public void registerUser(User user)
    {
        user.register();
        notificationFacade.notifyRegistration(user);
    }

    public void addVehicle(Vehicle vehicle)
    {
        rental.addVehicle(vehicle);
    }
    public void bookV(Vehicle vehicle, User user, int duration)
    {
        if (!vehicle.isAvailable()) {
            System.out.println("Booking failed" + vehicle.getModel() + " is not available!");
            return;
        }
        vehicle.setAvailable(false);
        double price = vehicle.getPriceTotal(duration);

        System.out.println("Booking " + vehicle.getModel() + " to " + user.getName() + " " + price);

    }

    public void updateVeAvai(String model, boolean available)
    {
        rental.updateVehiclesA(model,available);
    }
}
