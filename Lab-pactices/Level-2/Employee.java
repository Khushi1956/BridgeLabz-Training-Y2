import java.util.*;

abstract class Employee {
    private final int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId; this.name = name; this.baseSalary = baseSalary;
    }

    public int getEmployeeId(){ return employeeId; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public double getBaseSalary(){ return baseSalary; }
    public void setBaseSalary(double s){ baseSalary = s; }

    public abstract double calculateSalary(); // concrete logic differs
    public void displayDetails(){
        System.out.println("ID:"+employeeId+" Name:"+name+" Salary:"+calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double monthlyBonus;
    public FullTimeEmployee(int id,String name,double base,double bonus){
        super(id,name,base); this.monthlyBonus=bonus;
    }
    @Override public double calculateSalary(){ return getBaseSalary() + monthlyBonus; }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(int id,String name,double rate,int hours){
        super(id,name, rate * hours); this.hoursWorked=hours; this.hourlyRate=rate;
    }
    @Override public double calculateSalary(){ return hoursWorked * hourlyRate; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class DeptEmployee extends FullTimeEmployee implements Department {
    private String dept;
    public DeptEmployee(int id,String name,double base,double bonus){ super(id,name,base,bonus); }
    public void assignDepartment(String dept){ this.dept=dept; }
    public String getDepartmentDetails(){ return dept==null? "No Dept":dept; }
}

class EmployeeSystemDemo {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(1,"Alice",50000,5000));
        list.add(new PartTimeEmployee(2,"Bob",200,80));
        DeptEmployee de = new DeptEmployee(3,"Carol",40000,3000);
        de.assignDepartment("HR");
        list.add(de);
        for(Employee e : list) e.displayDetails(); // polymorphism
    }
}
