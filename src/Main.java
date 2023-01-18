import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println();   // для разделения вывода

        List<Integer> number = new ArrayList<>();
        for (int num : intList) {
            if (num > 0 && num % 2 == 0) {
                number.add(num);
            }
        }
        number.sort(Comparator.naturalOrder());
        for (int num : number) {
            System.out.println(num);
        }
    }


}
