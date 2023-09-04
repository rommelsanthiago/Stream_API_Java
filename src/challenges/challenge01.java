package challenges;

import java.util.Arrays;
import java.util.List;

public class challenge01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Desafio 01 - Mostrar a lista na ordem numérica:");
        System.out.println("Lista original: " + numeros);
        System.out.print("Lista ordenada: ");

        numeros.stream()
            .sorted(Integer::compareTo)
            .forEach(n -> System.out.print(n + ", "));
    }
};
