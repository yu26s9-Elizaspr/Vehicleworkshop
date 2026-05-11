import java.util.ArrayList;
import java.util.List;

public class dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<vehicle> inventory;

    public dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public String getName () {
        return name;
    }

    public String getAddress () {
        return address;
    }

    public String getPhone () {
        return phone;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public List<vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public List <vehicle> getVehiclesByMakeModel (String make, String model) {
        return null;
    }

    public List <vehicle> getVehiclesByYear (double min, double max) {
        return null;
    }

    public List <vehicle> getVehiclesByColor (String color) {
        return null;
    }

    public List <vehicle> getVehicleByMileage (double min, double max) {
        return null;

    }

    public List <vehicle> getVehicleByType (String vehicleType) {
        return null;
    }

    public List <vehicle> getAllVehicles () {
        return null;
    }

    public void addVehicle (vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void  removeVehicle (vehicle vehicle) {
        inventory.remove(vehicle);
    }

    }
