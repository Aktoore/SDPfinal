import java.util.ArrayList;
import java.util.List;
public class Rental {
    private List<Observer> observers = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }


    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle)
    {
        vehicles.remove(vehicle);
    }


    public void notifyOb(String Vmodel, boolean available)
    {
        for (Observer observer : observers)
        {
            observer.update(Vmodel, available);
        }
    }

    public void updateVehiclesA(String Vmodel, boolean available)
    {
        for (Vehicle vehicle: vehicles)
        {
            if (vehicle.getModel().equals(Vmodel))
            {
                vehicle.setAvailable(available);
                notifyOb(Vmodel, available);
                break;
            }
        }
    }


}
