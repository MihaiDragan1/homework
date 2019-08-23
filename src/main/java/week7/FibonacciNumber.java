package week7;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciNumber implements Supplier<Integer> {
    private int previous = +1;
    private int current = +2;
    private int next;

    @Override
    public Integer get(){
        next = current + previous;
        int temp = previous;
        previous = current;
        current = next;
        return temp;
    }

    public static List<Integer> fibonacciNumber(int number) {
        return Stream.generate(new FibonacciNumber()).limit(number).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FibonacciNumber.fibonacciNumber(40).forEach(System.out::println);
    }
}