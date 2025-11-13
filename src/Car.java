public class Car extends Vehicle {
    public Car(String model, PricingStrat pricingStrat) {
        super(model, pricingStrat);
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
