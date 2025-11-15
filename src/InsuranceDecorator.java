public class InsuranceDecorator extends VehicleDecorator {
    private double insuranceRate;
    
    public InsuranceDecorator(Vehicle decoratedVehicle, double insuranceRate) {
        super(decoratedVehicle);
        this.insuranceRate = insuranceRate;
    }
    
    @Override
    public double getPriceTotal(int duration) {
        double basePrice = decoratedVehicle.getPriceTotal(duration);
        return basePrice + (basePrice * insuranceRate);
    }
    
    @Override
    public String getModel() {
        return decoratedVehicle.getModel() + " + Full Insurance";
    }
    
    public String getDecoratorInfo() {
        return "Includes Full Insurance (+" + (insuranceRate * 100) + "%)";
    }
}