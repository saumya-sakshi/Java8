import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{

    String name;
    String hero;
    String heroine;
    String result;

    public Movie(String name, String hero, String heroine, String result) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
        this.result=result;
    }


}

public class MovieInfo {
    public static  void main(String[] args){
        ArrayList<Movie> list= new ArrayList<>();
        populate(list);
        Consumer<Movie> c1 = m -> System.out.println("Movie "+m.name+" is ready to release");
        Consumer<Movie> c2 = m -> System.out.println("Movie "+m.name+" is "+m.result);

        Consumer<Movie> c = m->{
            System.out.println("Movie name: "+m.name);
            System.out.println("Hero name: "+m.hero);
            System.out.println("Heroine name: "+m.heroine);
        };
//Chaining of Consumers based on andThen() default method
        Consumer<Movie> chained = c1.andThen(c2).andThen(c);

        for(Movie m :list){
            chained.accept(m);
            System.out.println("--------------------------------------------------------------------------------------");
        }


    }
    public  static void populate(ArrayList<Movie> list){
        list.add(new Movie("Bahubali","Prabhas","tammana","Hit"));
        list.add(new Movie("Kal ho na ho","Sharukh","Preety","Hit"));
        list.add(new Movie("Ashiqi2","Aditya roy Kapoor","sharadha Kapoor","Hit"));
        list.add(new Movie("Ruhi","Rajkumar rao","Janvhi Kapoor","Flop"));
        list.add(new Movie("Mom",null,"Sree devi","Hit"));


    }
}
