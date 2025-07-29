package softwareEngineer;

import java.util.function.Predicate;

public class AllowedInPub {
    public static void main(String[] args){
        SoftwareEngineer[] list= {new SoftwareEngineer("Rishav",23, true),
         new SoftwareEngineer("Aman",28, false),
      new SoftwareEngineer("Saurabh",27, true),
         new SoftwareEngineer("Archi",17, true),
         new SoftwareEngineer("Tiwari",16, false),
      new SoftwareEngineer("Dibyo",12, false),
         new SoftwareEngineer("Naveen",28, true)};

        Predicate<SoftwareEngineer> p = se->se.age>= 18 && se.isHavingGF;
        for(SoftwareEngineer se :list){
            if(p.test(se)){
                System.out.println(se);
            }
        }


    }
}
