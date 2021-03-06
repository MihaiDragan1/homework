package week7;


import java.util.Arrays;
import java.util.List;


public class StreamOp8 {

    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));


        /**
         * Find the transaction with the smallest value.
         */


        Transaction transactionA = transactions.stream()
                .max((transactions1, transaction2)->
                        transactions1.getValue() < transaction2.getValue() ? 1: -1).get();

        System.out.println(transactionA);

    }
}
