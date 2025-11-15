public class ChildSeatDecorator extends VehicleDecorator {
    private double seatCost;
    
    public ChildSeatDecorator(Vehicle decoratedVehicle, double seatCost) {
        super(decoratedVehicle);
        this.seatCost = seatCost;
    }
    
    @Override
    public double getPriceTotal(int duration) {
        return decoratedVehicle.getPriceTotal(duration) + seatCost;
    }
    
    @Override
    public String getModel() {
        return decoratedVehicle.getModel() + " + Child Seat";
    }
    
    public String getDecoratorInfo() {
        return "Includes Child Seat (+" + seatCost + " one-time fee)";
    }
}