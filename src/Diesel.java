public class Diesel implements FuelType {
    @Override
    public String getFuelType() {
        return "Diesel";
    }
    
    @Override
    public double getEfficiency() {
        return 0.4;
    }
}