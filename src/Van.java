public class Van extends Vehicle {
    public Van(String model, PricingStrat pricingStrat) {
        super(model, pricingStrat);
    }

    @Override
    public String getVehicleType() {
        return "Van";
    }
}
