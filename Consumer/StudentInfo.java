import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}


public class StudentInfo {
    public static  void main(String[] args){
        ArrayList<Student>list = new ArrayList<>();
        populated(list);
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
        Consumer<Student> c = s->{
            System.out.println("Student Name :"+s.name);
            System.out.println("Student Marks :"+s.marks);
            System.out.println("Student Grade :"+ grade.apply(s));
        };

        for(Student s:list){
            if (p.test(s)) {

                c.accept(s);
                System.out.println("--------------------------------------------------------------------------------------");
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
