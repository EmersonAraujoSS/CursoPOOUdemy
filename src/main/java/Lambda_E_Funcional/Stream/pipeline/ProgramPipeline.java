package Lambda_E_Funcional.Stream.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipeline {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray())); //pegando os numeros da minha lista e multiplicando por 10

        int sum = list.stream().reduce(0, (x, y) -> x + y);  // pegando os numeros da minha lista e somando
        System.out.println("Sum: " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) //filtrando os numeros que sao divisiveis por 2
                .map(x -> x * 10) // pegando esses numeros e multiplicando por 10
                .collect(Collectors.toList()); // transformando essa Stream em lista
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
