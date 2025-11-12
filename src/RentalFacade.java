public class RentalFacade {
    private Rental rental = new Rental();
    private NotificationFacade notificationFacade = new NotificationFacade();


    public void addObserver(User user)
    {
        rental.addObserver(new UserObserver(user.name));
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
        double price = vehicle.getPriceTotal(duration);
        System.out.println(user.name + " booked "+vehicle.getModel()+" for "+ duration);
        System.out.println("Total price "+ price);
        notificationFacade.notifyBooking(user, vehicle.getModel());
    }

    public void updateVeAvai(String model, boolean available)
    {
        rental.updateVehiclesA(model,available);
    }
}
