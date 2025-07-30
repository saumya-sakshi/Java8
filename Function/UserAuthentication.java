import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

class Users{
    String userName;
    String pwd;

    public Users(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }


}
public class UserAuthentication
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your username:");
       String username=sc.next();
       System.out.println("Enter your password:");
       String pwd=sc.next();
       Function<String,String> f1 = s->s.substring(0,5);
       Function<String,String> f2 = s->s.toLowerCase();
       if(f1.andThen(f2).apply(username).equals("durga") && pwd.equals("java")){
            System.out.println("Valid User");
       }else System.out.println("Not a Valid User");


   }
}
