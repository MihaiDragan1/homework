package week7;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


import static java.util.Comparator.comparing;


public class StreamOp3 {

    public static void main(String[] args) {

        List<Trader> traders = new ArrayList<>();

        traders.add(new Trader("Raoul", "Cambridge"));
        traders.add(new Trader("Mario", "Milan"));
        traders.add(new Trader("Alan", "Cambridge"));
        traders.add(new Trader("Brian", "Cambridge"));

        /**
         * Find all traders from Cambridge and sort them by name.
         **/


        List<Trader> collect = traders.stream()
               .filter(trader -> trader.getCity() == "Cambridge")
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
