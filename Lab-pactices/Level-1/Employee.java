class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private String name, designation;
    private final int id;

    Employee(String name, int id, String designation) {
        this.name = name; this.id = id; this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee)
            System.out.println("Company: " + companyName + ", Name: " + name + ", ID: " + id + ", Role: " + designation);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rita", 1, "Manager");
        e1.displayDetails();
        Employee.displayTotalEmployees();
    }
}
