import java.util.function.Function;

public class StringWithoutSpaces
{
    public static void main(String[] args){
        Function<String, String> f = s -> s.replaceAll(" ","");
        System.out.println(f.apply("Saumya Sakshi is a good girl"));

        Function<String, Integer> f2 = s -> s.length()-s.replaceAll(" ","").length();
        System.out.println(f2.apply("Saumya Sakshi is a good girl"));
    }
}
