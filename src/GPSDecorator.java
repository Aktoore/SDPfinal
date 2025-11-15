public class GPSDecorator extends VehicleDecorator {
    private double gpsCost;
    
    public GPSDecorator(Vehicle decoratedVehicle, double gpsCost) {
        super(decoratedVehicle);
        this.gpsCost = gpsCost;
    }
    
    @Override
    public double getPriceTotal(int duration) {
        return decoratedVehicle.getPriceTotal(duration) + (gpsCost * duration);
    }
    
    @Override
    public String getModel() {
        return decoratedVehicle.getModel() + " + GPS Navigation";
    }
    
    public String getDecoratorInfo() {
        return "Includes GPS Navigation (+" + gpsCost + "/hour)";
    }
}