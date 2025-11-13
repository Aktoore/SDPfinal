public class Bike extends Vehicle {
    public Bike(String model, PricingStrat pricingStrat) {
        super(model, pricingStrat);
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}
