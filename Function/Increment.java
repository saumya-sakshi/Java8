import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employees{
    String name;
    double salary;

    public Employees(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return  name + ": "+ salary;
    }
}
    public class Increment {
        public static void main(String[] args) {
            ArrayList<Employees> list = new ArrayList<>();
            populate(list);
            System.out.println("Before Increment: " +list);
            Predicate<Employees> p = e-> e.salary<=3500;
            Function<Employees, Employees> f = e-> {
                e.salary = e.salary + 477;
                return e;
            };
            ArrayList<Employees> l2 = new ArrayList<>();
            for(Employees e : list){
                if (p.test(e)) {
                   l2.add(f.apply(e));

                }

            }
            System.out.println("After Increment: " + list);
            System.out.println("List of Employees with Increment: "+ l2);
        }

        public static void populate(ArrayList<Employees> list) {
            list.add(new Employees("Saumya", 8000.00));
            list.add(new Employees("Sakshi", 2000.00));
            list.add(new Employees("Akriti", 3000.00));
            list.add(new Employees("Mona", 3500.00));
            list.add(new Employees("Shreya", 4500.00));
            list.add(new Employees("Yasho", 3580.00));


        }
    }