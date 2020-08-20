import java.util.*;

public class EmployeeSortTest{

    public static void main(String[] args){

        Employee number1 = new Employee("Carl", 2, "Engineer");
        Employee number2 = new Employee("Susan", 10, "Manager");
        Employee number3 = new Employee("Kevin", 1, "Data Entry");
        Employee number4 = new Employee("Alexa", 1000, "BossLady");

        Employee[] employeeArr = {number2, number1, number3, number4};

        sortByName(employeeArr);

        System.out.println(Arrays.toString(employeeArr));

        sortBySalary(employeeArr);

        System.out.println(Arrays.toString(employeeArr));

    }

    public static void sortByName(Employee[] arr){

        Arrays.sort(arr, new Comparator<Employee>(){
            public int compare(final Employee employee1, final Employee employee2){
                return employee1.getName().compareTo(employee2.getName());
            }
        });
    }

    public static void sortBySalary(Employee[] arr){

        Arrays.sort(arr, new Comparator<Employee>(){
            public int compare(final Employee employee1, final Employee employee2){
                if(employee1.getSalary() > employee2.getSalary()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}