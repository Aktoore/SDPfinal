public class Electric implements FuelType {
    @Override
    public String getFuelType() {
        return "Electric";
    }
    
    @Override
    public double getEfficiency() {
        return 0.9;
    }
}