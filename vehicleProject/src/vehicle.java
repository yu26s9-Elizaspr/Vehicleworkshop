public class vehicle {
    private int vin;
    private int year;
    private String make;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public vehicle (int vin, int year, String make, String vehicleType, String color,
    int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
}
