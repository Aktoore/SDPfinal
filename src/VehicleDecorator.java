public abstract class VehicleDecorator extends Vehicle {
    protected Vehicle decoratedVehicle;
    
    public VehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle.getModel(), 
              decoratedVehicle.pricingStrat,
              decoratedVehicle.fuelType,
              decoratedVehicle.color);
        this.decoratedVehicle = decoratedVehicle;
    }
    
    @Override
    public String getVehicleType() {
        return decoratedVehicle.getVehicleType();
    }
}