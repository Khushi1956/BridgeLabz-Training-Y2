class Vehicle {
    private static double registrationFee = 5000;

    private String ownerName, vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName; this.vehicleType = vehicleType; this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        if (this instanceof Vehicle)
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg#: " + registrationNumber + ", Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Anita", "Car", "MH12AB1234");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails();
    }
}
