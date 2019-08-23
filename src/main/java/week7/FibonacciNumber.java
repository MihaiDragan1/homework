package week7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FibonacciNumber {
    public List<Long> generate(long series) {
        return Stream.iterate(new long[]{0, 1}, i -> new long[]{i[1], i[0] + i[1]})
                .limit(series)
                .map(i -> i[0])
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacci = new FibonacciNumber();
        System.out.print(fibonacci.generate(100)+"");
    }
}