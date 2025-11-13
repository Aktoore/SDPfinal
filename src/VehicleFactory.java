public class VehicleFactory {
    public static Vehicle createVehicle(String type, String model, PricingStrat pricingStrat) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(model, pricingStrat);
            case "bike":
                return new Bike(model, pricingStrat);
            case "van":
                return new Van(model,pricingStrat);
            default:
                throw new IllegalArgumentException("Invalid vehicle type" + type);
        }
    }
}