package artur.goz;

public class Driver extends User{
    private String licenseNumber;
    private Vehicle vehicle;

    public Driver(int id, String name, String email, String password, Vehicle vehicle, String licenseNumber) {
        super(id, name, email, password);
        this.vehicle = vehicle;
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
