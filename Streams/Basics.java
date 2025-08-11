import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(83);
        l.add(10);
        l.add(10);
        l.add(10);
        l.add(5);
        l.add(7);
        l.add(7);
        l.add(20);
        l.add(40);
        l.add(40);

        System.out.println(l);
        List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3= l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l3);
       Stream stream = l.stream().filter(i->i%2==0);
        System.out.println(stream);
//1. simple runnable example:
        Runnable r = ()->System.out.println("Runnable method");
        new Thread(r).start();
        //2.Iterating list with Lambda

        List<String> names = new ArrayList<>();
        names.add("Saumya");
        names.add("Sakshi");
        names.add("Rishav");
        names.add("Anand");
        names.add("Biswateeta");
        names.add("Madhushimta");
        names.add("Amisha");
        names.add("Achuyat");
        names.add("Dibyo");
        names.add("Avinash");
        names.add("Avnish");
        names.add("Preety");
        names.add("simi");
        names.add("kishun");
        names.add("Naveen");
        names.add("Neha");

        List<String> filteredName = names.stream().filter(i->i.length()<=6).collect(Collectors.toList());
        //filteredName.forEach(System.out::println);

        //3. sorting a list wih a lambda
        //ascending
        filteredName.sort((s1,s2)->s1.compareTo(s2));
        //descending
        //filteredName.sort((s1,s2)->s1.compareTo(s2));
        filteredName.forEach(System.out::println);

        //4.lambda with map iteration
        Map<String, String> map = new HashMap<>();
        map.put("A","Saumya");
        map.put("B","Sakshi");
        map.put("C","Rishav");

        map.forEach((k,v)->System.out.println("key : "+k+" , Value : "+ v));

        // 5. creating a thread using lambda
        new Thread(()->System.out.println("Hello new thread using lambda")).start();

        //6. Lambda in comparator
        //sorting based on length of string
        names.sort(Comparator.comparingInt(String::length));
        System.out.println("sorting based on length of string");
        names.forEach(System.out::println);

        //7. Lambda with optional
        Optional<String> values = Optional.of("Java");
        values.ifPresent(value->System.out.println("value is present is "+value));

        //8. Lambda with Predicate:
        Predicate<String> p = string-> string.isEmpty();
        System.out.println(p.test(""));
        System.out.println(p.test("Saumya"));

        //9. Lambda with Bi Function
        BiFunction<Integer, Integer, Integer> f = (a,b)->a+b;
        System.out.println("The sum of 5 and 8 is : "+ f.apply(5,8));

        //10. Lambda with consumer
        Consumer<String> print = a->System.out.println(a);
        print.accept("Hello World");


        //11. Lambda with supplier
        Supplier<String> stringSupplier= ()->"Java";
        System.out.println(stringSupplier.get());


        //`Lambda with function
        Function<String,Integer> f1 = s->s.length();
        System.out.println(f1.apply("Lambda"));

        //UnaryOperator
        UnaryOperator<Integer> square = i->i*i;
        System.out.println(square.apply(4));

        //BinaryOperator
        BinaryOperator<Integer> multiply = (a,b)->a*b;
        System.out.println(multiply.apply(4,5));


        //18Lambda for checking even numbers
        Predicate<Integer> evenTest = i -> i%2==0;
        System.out.println("Is 4 a even number: "+evenTest.test(4));
        System.out.println("Is 17 a even number: "+evenTest.test(17));

        //19. lAMBDA with custom sorting

        List<String> list = Arrays.asList("Apple","Mango","Kiwi","Orange");
        //sort in reverse order

        list.sort((s1,s2)->-s1.compareTo(s2));

        System.out.println(list);

        //20. Lambda with UpperCase Conversion
        List<String> upperList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperList);

        //21 Lambda with Stream reduce
        // find sum of all elements
        System.out.println("List of elements : "+l);
        System.out.println("Sum of elements present in above list: "+
                l.stream().reduce(0,(a,b)->a+b)
                );

// 22 Lambda with Stream filter:
        // even numbers
        List<Integer> evenL = l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("List of even elements from list : "+evenL);

// 23 Lambda with Stream Map:
// convert all string to lowerCase

        List<String> lowerString = upperList.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("List of lower case elements from list : "+lowerString);


// 24 Lambda with Stream distinct
        System.out.println("List of elements : "+l);
        List<Integer> distinctInt = l.stream().distinct().collect(Collectors.toList());
        System.out.println("List with no duplicates from above list : "+distinctInt);


//25   Lambda with Stream sorted
        System.out.println("List of elements : "+l);
        l.stream().distinct().sorted().forEach(System.out::println);

//26   Lambda with Stream Count
        System.out.println("Count of distinct elements in list: "+l.stream().distinct().count());

//27   Lambda with Stream AnyMatch

System.out.println("Does names have Saumya: "+ names.stream().anyMatch(s->s.equals("Saumya")));

//28.  Lambda with Streams AllMatch()

        System.out.println("Does List has all even: "+ l.stream().allMatch(s->s%2==0));

//29  Lambda with Streams noneMatch
        System.out.println("Does List has no even: "+ l.stream().noneMatch(s->s%2==0));


//30 Lambda with Streams FindFirst
        System.out.println("List of elements : "+l);
        System.out.println("First element" );
        l.stream().findFirst().ifPresent(System.out::println);

        l.stream().filter(s->s==20).findFirst().ifPresent(System.out::println);

//31 FindAny
        System.out.println("List of elements : "+l);
        System.out.println("First element" );
        l.stream().findAny().ifPresent(System.out::println);

        l.stream().filter(s->s>10).findAny().ifPresent(System.out::println);


        //32 Lambda for summing Integers mapToInt
        System.out.println("Sum of elements of list: "+
                l.stream().mapToInt(Integer::intValue)
                        .sum()
                );

        //  34 Lambda for Max Integer

        System.out.println("Max of elements of list: "+
                l.stream().mapToInt(Integer::intValue)
                        .max()
                        .orElse(Integer.MIN_VALUE)
        );


        //  34 Lambda for Min Integer

        System.out.println("Min of elements of list: "+
                l.stream().mapToInt(Integer::intValue)
                        .min()
                        .orElse(Integer.MAX_VALUE)
        );


        // 35 Lambda for Joining Strings

        String joined = names.stream().collect(Collectors.joining(":"));
        System.out.println(joined);

        //37 Lambda with Stream MapToInt
        System.out.println("Here Begins length of each elements of names");
        names.stream().mapToInt(String::length).forEach(System.out::println);

        //38 Lambda with Stream colect to set

        Set<Integer> set = l.stream().collect(Collectors.toSet());
        System.out.println("Here Begins Set elements");
        set.forEach(System.out::println);

        //    Lambda with Stream GroupingBY
        Map<Integer, Long> frequency = l.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        frequency.forEach((k,v)->System.out.println(k+" : "+v));

        //    Lambda with Stream PartionBY
        Map<Boolean, List<Integer>> partition = l.stream().collect(Collectors.partitioningBy(s->s%2==0));
        partition.forEach((k,v)->System.out.println(k+" : "+v));


        //Lambda with Stream Counting

        Long count = l.stream().collect(Collectors.counting());
        System.out.println(count);


        //42 Lambda with Stream summarizingInt

        IntSummaryStatistics stats = names.stream().collect(Collectors.summarizingInt(String::length));

        System.out.println(stats);

        System.out.println("Sum: "+stats.getSum());
        System.out.println("Count: "+stats.getCount());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());

        //43 String and Lambda with Stream Mapping

        Map<Integer, List<String>> frq = names.stream().collect(Collectors.groupingBy(String::length));
        frq.forEach((k,v)->System.out.println(k+" : "+v));

        //44 other way - Lambda with Stream toMap

        Map<String, Integer> frqmap = names.stream().collect(Collectors.toMap(s->s,String::length));
        frqmap.forEach((k,v)->System.out.println(k+" : "+v));

        //45 Lambda with Stream Joining without Delimiter
        String joinedwo = list.stream().collect(Collectors.joining());
        System.out.println(joinedwo);


        //46 Lambda for Creating Stream

        Stream<String> streams = Stream.of("Java","Spring","React","Angular");
        streams.forEach(System.out::println);
        System.out.println("--------------------------------------");

        //47 Lambda with Stream Limit

        Stream<String> streams2 = Stream.of("Java","Spring","React","Angular");
        streams2.limit(2).forEach(System.out::println);
        System.out.println("--------------------------------------");

        //48 Lambda with Stream skip

        Stream<String> streams3 = Stream.of("Java","Spring","React","Angular");
        streams3.skip(1).forEach(System.out::println);
        System.out.println("--------------------------------------");

        //49 Lambda with Stream peek

        Stream<String> streams4 = Stream.of("Java","Spring","React","Angular");
        streams4
                .peek(System.out::println)
                .filter(s->s.length()>4);

        System.out.println("--------------------------------------");

        //50 Lambda with Optional

        Optional<String> op = Optional.of("Java");
        op.ifPresent(System.out::println);


















    }
}
