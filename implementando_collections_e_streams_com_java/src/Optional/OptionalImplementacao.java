package Optional;


import org.jetbrains.annotations.NotNull;

import java.io.Console;
import java.util.Optional;

public class OptionalImplementacao {

    static void testOptions(@NotNull Optional<String> str){
        //Se presente, exiba o valor no console
        //Senão exibe Optional vazio
        str.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        //Se vazio, lance uma exceção ilegalStateException
        str.orElseThrow(() -> new IllegalArgumentException("Erro: Optional vazio"));

        //Se presente, transforme o valor e exiba no console
        str.map(valor -> valor.toUpperCase())
                .ifPresent(System.out::println);

        //Se presente pegue o valor do optional e atribua em uma variavel
        if(str.isPresent()){
            final var valor = str.get();
            System.out.println(valor);
        }

        //Se presente filtre o optional com uma determinada regra de négocio
        str.filter(valor -> !valor.isEmpty()).ifPresent(valor -> System.out.println("Não é vazio"));

    }

    public static void main(String[] args) {
        testOptions(Optional.of("Isso é um teste"));
        try {
            testOptions(Optional.empty());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

        try {
            testOptions(Optional.ofNullable(null));
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }




    }
}
