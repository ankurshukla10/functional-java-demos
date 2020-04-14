package functionalPackage;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static BiFunction<Integer, Integer, Integer> increment1ThenMultiply = (numToIncrementBy1, numberToMultiply) ->
            (numToIncrementBy1 + 1) * numberToMultiply;
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    public static void main(String[] args) {

//        int increment = incrementByOne(0);
//        System.out.println(increment);
//
//        int _increment = incrementByOneFunction.apply(1);
//        System.out.println(_increment);

        // creates a composed function, hence ++number works but not number++
        System.out.println(incrementByOneFunction.andThen(multiplyBy10).apply(4));
//        System.out.println(add1ThenMultiply(4,100));
        System.out.println(increment1ThenMultiply.apply(4, 100));

    }

    static int add1ThenMultiply(int num, int numToMultiply) {
        return (num + 1) * numToMultiply;
    }

//    static int incrementByOne(int number){
//        return number+1;
//    }
}
