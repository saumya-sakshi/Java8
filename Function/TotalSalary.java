import java.util.ArrayList;
import java.util.function.Function;

//Progarm to find Total Monthly Salary of All Employees by using Function
class Employee{
    String name;
    double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class TotalSalary {

    public static void main(String[] args){
        ArrayList<Employee> list= new ArrayList<>();
        populate(list);
        System.out.println(list);
        Function<ArrayList<Employee>,Double> totalSum = l -> {
            double total=0;
            for(Employee e :l){
                total=total+e.salary;
            }
            return total;
        };
        System.out.println("The total salary of all employees is: "+totalSum.apply(list));

    }

    public static void populate(ArrayList<Employee> list){
        list.add(new Employee("Saumya",58000.00));
        list.add(new Employee("Sakshi",198000.00));
        list.add(new Employee("Akriti",88000.00));
        list.add(new Employee("Mona",158000.00));
        list.add(new Employee("Shreya",45000.00));
        list.add(new Employee("Yasho",358000.00));




    }
}
