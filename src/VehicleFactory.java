public class VehicleFactory {
    public static Vehicle createVehicle(String type, String model, PricingStrat pricingStrat, FuelType fuelType, Color color) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(model, pricingStrat, fuelType, color);
            case "bike":
                return new Bike(model, pricingStrat, fuelType, color);
            case "van":
                return new Van(model, pricingStrat, fuelType, color);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}