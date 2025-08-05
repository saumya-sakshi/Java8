import java.util.Date;
import java.util.function.Supplier;

//Program to get System Date by using Supplier
public class GetDate {
    public static void main(String[] args){
        Supplier<Date> s= ()-> new Date();

        System.out.println("Today's Date: "+s.get());
    }

}
