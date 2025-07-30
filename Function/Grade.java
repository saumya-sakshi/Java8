import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Grade {
    public static void main(String[] args){
        //Program to find Student Grade by using Function
        ArrayList<Student> list = new ArrayList<>();
        populated(list);
        System.out.println(list);
        System.out.println("--------------------------------------------------------");
        Function<Student,String> grade = student -> {
            int marks= student.marks;
            if(marks>90) return "O[Distinction grade]";
            else if(marks>80) return "A[First grade]";
            else if(marks>70) return "B[Second grade]";
            else if(marks>60) return "C[Third grade]";
            else if(marks>50) return "D[Forth grade]";
            else if(marks>40) return "E[Fifth grade]";
            else return "F[FAIL]";
        };
        Predicate<Student> p = s-> s.marks>=60;
        for(Student s : list){
            System.out.println("Student Name: "+s.name);
            System.out.println("Student Marks: "+s.marks);
            System.out.println("Student Grade: "+grade.apply(s));
            System.out.println("--------------------------------------------------------");

        }
        System.out.println("Students with marks greater than 60");
        System.out.println("--------------------------------------------------------");
        for(Student s : list){
            if(p.test(s)){
                System.out.println("Student Name: " + s.name);
                System.out.println("Student Marks: "+s.marks);
                System.out.println("Student Grade: "+grade.apply(s));
                System.out.println("--------------------------------------------------------");
            }
        }
    }


    public static  void populated(ArrayList<Student> list){
        list.add(new Student("Saumya",88));
        list.add(new Student("Rishav",99));
        list.add(new Student("Amisha",45));
        list.add(new Student("Mini",79));
        list.add(new Student("Madhu",81));
        list.add(new Student("Archi",38));
        list.add(new Student("Dibyo",61));
        list.add(new Student("Preety",92));

    }
}


