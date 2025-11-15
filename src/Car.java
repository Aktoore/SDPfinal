public class Car extends Vehicle {
    public Car(String model, PricingStrat pricingStrat, FuelType fuelType, Color color) {
        super(model, pricingStrat, fuelType, color);
    }
    
    @Override
    public String getVehicleType() {
        return "Car";
    }
}