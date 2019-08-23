package week7;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;


public class StreamOp2 {

    public static void main(String[] args) {

        List<Trader> traders = new ArrayList<>();

       traders.add(new Trader("Raoul", "Cambridge"));
       traders.add(new Trader("Mario", "Milan"));
       traders.add(new Trader("Alan", "Cambridge"));
       traders.add(new Trader("Brian", "Cambridge"));

        /**
         * What are all the unique cities where the traders work?
         */


        List<Trader> collect = traders.stream()
                .sorted(comparing(Trader::getCity))
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
