import java.util.*;
import java.util.stream.*;

class A{
    String aro;
    static String bro;
}

public class test{
    public static void main(String[] args){
        // A a1 = new A();
        // A a2 = new A();

        // a1.bro = "Laptop";
        // System.out.println(a1.bro);

        // a2.bro = "Computer";
        // System.out.println(a1.bro);
        // System.out.println(a2.bro);

        String trial = "Methalepurayil";

        char[] charArray = trial.toCharArray();

        // for(char ch : charArray)
        // {
        //     System.out.println(ch);
        // }


        // List<Character> list = 
                                // IntStream.range(0, charArray.length)
                                //     .mapToObj(i -> charArray[i])
                                //     .collect(Collectors.toList())
                                //     .forEach(System.out::println);

        // list.forEach(ch -> {
        //     System.out.println(ch);
        // });

        // String[] strArray = {"Varsha", "Omkar", "Arjun", "Samy"};

        // Arrays.asList(strArray).forEach(ch -> {
        //     System.out.println(ch);
        // });

        // int[] intArray = new int[]{55,64,82,33,20};

        // // List<Integer> intList = 
        //                         IntStream.of(intArray)
        //                             .boxed()
        //                             .collect(Collectors.toList())
        //                             .forEach(System.out::println);

        String[] strArray = {"Varsha", "Omkar", "Arjun", "Samy","Varsha"};

        // String[] distinctArray = 
                                Arrays
                                    // .asList(strArray)
                                    .stream(strArray)
                                    .distinct()
                                    // .toArray(String[]::new)
                                    .forEach(System.out::println);
    }

}