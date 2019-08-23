package week7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class StreamOp4 {

    public static void main(String[] args) {

        List<Trader> traders = Arrays.asList(
                new Trader("Raoul", "Cambridge"),
                new Trader("Mario", "Milan"),
                new Trader("Alan", "Cambridge"),
                new Trader("Brian", "Cambridge"));


        /**
         * Return a string of all traders’ names sorted alphabetically.
         */

        List<Trader> collect = traders.stream()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
