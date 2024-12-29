package artur.goz;

public class Ride {
    private int rideId;
    private Passenger passenger;
    private Driver driver;
    private String pickupLocation;
    private String dropoffLocation;
    private double fare;
    private String status; // e.g., "Requested", "Accepted", "Completed"

    public Ride(int rideId, Passenger passenger, Driver driver, String pickupLocation, String dropoffLocation, double fare, String status) {
        this.rideId = rideId;
        this.passenger = passenger;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.fare = fare;
        this.status = status;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideId=" + rideId +
                ", passenger=" + passenger +
                ", driver=" + driver +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropoffLocation='" + dropoffLocation + '\'' +
                ", fare=" + fare +
                ", status='" + status + '\'' +
                '}';
    }
}
