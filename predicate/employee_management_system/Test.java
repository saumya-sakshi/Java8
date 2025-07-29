package employee_management_system;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args){

        ArrayList<Employee> list = new ArrayList<>();
        populate(list);
        System.out.println(list);
        Predicate<Employee> p1 = e-> e.designation.equals("Associate");
        System.out.println("list of Associate");
        display(list,p1);
        Predicate<Employee> p2 = e-> e.city.equals("Bangalore");
        System.out.println("list of Bangalore employees");
        display(list,p2);
        Predicate<Employee> p3 = e-> e.salary<60000;
        System.out.println("list of employees available for bonus");
        display(list,p3);
        System.out.println("list of employees going for cut off");
        display(list,p1.and(p2)); //predicate joining

        System.out.println("list of employees are associate or are going for bonus");
        display(list,p1.or(p3)); //predicate joining
        System.out.println("list of employees who are not associates");
        display(list,p1.negate()); //predicate joining
    }

    public static void display(ArrayList<Employee> list, Predicate<Employee> p){
        System.out.println("-----------------------------------------------------------------------------------------");
        for(Employee e:list)
        {
            if(p.test(e)){
                System.out.println(e);

            }

        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void populate(ArrayList<Employee> list){
        list.add(new Employee("Saumya", "CEO", 300000, "Pune"));
        list.add(new Employee("Amisha", "senior devops", 200000, "Bangalore"));
        list.add(new Employee("Rishav", "IAS", 75000, "Delhi"));
        list.add(new Employee("Mini", "Associate", 60000, "kolkata"));
        list.add(new Employee("Madhu", "A", 55000, "Bangalore"));
        list.add(new Employee("Archi", "Associate", 58000.00, "Bangalore"));
        list.add(new Employee("Dibyo", "Associate", 40000, "Delhi"));




    }
}
