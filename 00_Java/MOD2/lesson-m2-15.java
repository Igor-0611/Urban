import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание №1:");

        Stream <Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        Map<Boolean, Integer> result = integerStream.collect
                (Collectors.partitioningBy(x -> x%2==0, Collectors.summingInt(Integer::intValue)));

        for (Map.Entry<Boolean, Integer> item: result.entrySet()) {
            if (item.getKey()) System.out.print("Сумма четных чисел = ");
            else System.out.print("Сумма нечетных чисел = ");
            System.out.println(item.getValue());
        }
        //-----------------------------------------------------------------
        System.out.println("\nЗадание №2:");

        Stream <Integer> intStream = Stream.of(1,2,3,4,3,2,1,8,9,10,11,10,9,8,15,16,17,16,15,20);

        List<Integer> disInt = intStream.distinct().collect(Collectors.toList());
        System.out.println(disInt);
    }
}