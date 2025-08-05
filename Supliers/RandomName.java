import java.util.Scanner;
import java.util.function.Supplier;

//Program to get Random Name by using Supplier
public class RandomName {

    public  static  void main(String[] args){
        Supplier<String> s = ()->{
            String[] names= {"Saumya","Rishav","Amisha","Mini","Madhu","Neha","Archi","Naveen","Ankit","Aman","Pranita","Dibyo","Simi","Kishun","Avinash","Avnish"};
            int x =(int)(Math.random()*names.length);
            return names[x];
        };
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Game is running...");
            System.out.print("Do you want to continue? (y/n): ");
            userInput = scanner.nextLine().toLowerCase();
            System.out.println(s.get());
        } while (userInput.equals("y"));

        System.out.println("Game stopped. Thanks for playing!");
        scanner.close();
    }
}
