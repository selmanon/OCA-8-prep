import java.util.*;

public class IteratorOrLoop {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        input = Collections.unmodifiableList(input);



        // java 8 based solution
        //input.removeIf( integer -> integer > 5);


        // working code
        Iterator<Integer> iter = input.iterator();

//        while(iter.hasNext()){
//            if(iter.next() == 3)
//                iter.remove();
//        }

        System.out.println(input);


        // for in and forEach both of them throw ConcurrentModificationException

        List<Integer> finalInput = input;
        input.forEach(element ->
                {
                    System.out.println(element);
                    if (element  == 5) {
                        finalInput.remove(element);
                    }
                }
        );
    }
}
