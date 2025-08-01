import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{

    String name;
    String hero;
    String heroine;

    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

public class MovieInfo {
    public static  void main(String[] args){
        ArrayList<Movie> list= new ArrayList<>();
        populate(list);
        Consumer<Movie> c = m->{
            System.out.println("Movie name: "+m.name);
            System.out.println("Hero name: "+m.hero);
            System.out.println("Heroine name: "+m.heroine);
        };

        for(Movie m :list){
            c.accept(m);
            System.out.println("--------------------------------------------------------------------------------------");
        }


    }
    public  static void populate(ArrayList<Movie> list){
        list.add(new Movie("Bahubali","Prabhas","tammana"));
        list.add(new Movie("Kal ho na ho","Sharukh","Preety"));
        list.add(new Movie("Ashiqi2","Aditya roy Kapoor","sharadha Kapoor"));
        list.add(new Movie("Ruhi","Rajkumar rao","Janvhi Kapoor"));
        list.add(new Movie("Mom",null,"Sree devi"));


    }
}
