class Patient {
    private static String hospitalName = "Apollo Hospital";
    private static int totalPatients = 0;

    private String name, ailment;
    private int age;
    private final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name; this.age = age; this.ailment = ailment; this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient)
            System.out.println("Hospital: " + hospitalName + ", Name: " + name + ", Age: " + age +
                    ", Ailment: " + ailment + ", ID: " + patientID);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Sohan", 45, "Fever", 201);
        p1.displayDetails();
        Patient.getTotalPatients();
    }
}
