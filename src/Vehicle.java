public abstract class Vehicle {
    protected String model;
    protected PricingStrat pricingStrat;
    protected boolean available;
    protected FuelType fuelType;
    protected Color color;
    
    public Vehicle(String model, PricingStrat pricingStrat, FuelType fuelType, Color color) {
        this.model = model;
        this.pricingStrat = pricingStrat;
        this.fuelType = fuelType;
        this.color = color;
        this.available = true;
    }
    
    public abstract String getVehicleType();
    
    public void setPricingStrat(PricingStrat pricingStrat) {
        this.pricingStrat = pricingStrat;
    }
    
    public double getPriceTotal(int duration) {
        return pricingStrat.calcPrice(duration);
    }
    
    public String getModel() {
        return model;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public String getFuelInfo() {
        return fuelType.getFuelType() + " (Efficiency: " + (fuelType.getEfficiency() * 100) + "%)";
    }
    
    public String getColorInfo() {
        return color.getColorName() + " (" + color.getHexCode() + ")";
    }
    
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
}