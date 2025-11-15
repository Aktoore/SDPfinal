public class Petrol implements FuelType {
    @Override
    public String getFuelType() {
        return "Petrol";
    }
    
    @Override
    public double getEfficiency() {
        return 0.3;
    }
}