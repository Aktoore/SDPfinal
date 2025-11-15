public class Van extends Vehicle {
    public Van(String model, PricingStrat pricingStrat, FuelType fuelType, Color color) {
        super(model, pricingStrat, fuelType, color);
    }
    
    @Override
    public String getVehicleType() {
        return "Van";
    }
}