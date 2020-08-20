public class Employee{

    private String name;
    private double salary;
    private String employeeType;

    public Employee(String name, double salary, String type){

        this.name = name;
        this.salary = salary;
        this.employeeType = type;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getType(){
        return this.employeeType;
    }

    public String toString(){
        String employeeLabel = name + "," + salary + "," + employeeType;
        return employeeLabel;
    }
}