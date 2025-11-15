public class Bike extends Vehicle {
    public Bike(String model, PricingStrat pricingStrat, FuelType fuelType, Color color) {
        super(model, pricingStrat, fuelType, color);
    }
    
    @Override
    public String getVehicleType() {
        return "Bike";
    }
}