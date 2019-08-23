package week7;

import java.util.Arrays;
import java.util.List;


public class StreamOp5 {

    public static void main(String[] args) {

        List<Trader> traders = Arrays.asList(
                new Trader("Raoul", "Cambridge"),
                new Trader("Mario", "Milan"),
                new Trader("Alan", "Cambridge"),
                new Trader("Brian", "Cambridge"));


        /**
         * Are any traders based in Milan?
         */

        boolean collect1 = traders.stream().anyMatch(trader -> trader.getCity() == "Milan");


        System.out.println(collect1);


    }
}
