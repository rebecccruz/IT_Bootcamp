package assuntos.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo05 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Stream<Integer> stream = lista.stream();
//        stream.forEach(n -> System.out.println(n));

        List<Integer> listaAlterada = lista.stream()
                .filter((n -> n % 2 == 0))
                .map(n -> n * 2)
                .collect(Collectors.toList());

        long count = lista.stream()
                .filter((n -> n % 2 == 0))
                .count();


        lista.stream().map(n -> n * 2);
        lista.forEach((n -> System.out.print(n + " ")));
        System.out.println("Qntd de pares " + count);
        listaAlterada.forEach(n -> System.out.print(n + " "));

    }
}
