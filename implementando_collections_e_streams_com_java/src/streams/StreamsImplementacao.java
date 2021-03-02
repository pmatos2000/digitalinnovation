package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamsImplementacao {
    public static class Estudante{
        private String nome;
        private int idade;

        public Estudante(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Estudante{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }

    public static void main(String[] args) {
        final var estudantes = new ArrayList<Estudante>();
        estudantes.add(new Estudante("Paulo", 22));
        estudantes.add(new Estudante("Lucas", 18));
        estudantes.add(new Estudante("Daniel", 14));
        estudantes.add(new Estudante("Ana", 19));
        estudantes.add(new Estudante("Bruno", 12));
        estudantes.add(new Estudante("Katia", 27));
        estudantes.add(new Estudante("Lumena", 30));
        estudantes.add(new Estudante("Gil", 40));
        estudantes.add(new Estudante("Roberta", 33));

        //Transforme cada estudante em uma string com os atributos dos objetos
        final var atributos =  estudantes
                .stream()
                .map(estudante -> estudante.nome + "-" + estudante.idade)
                .collect(Collectors.toList());
        System.out.println(atributos);

        //Conte a quantidade de estudantes têm na coleção
        System.out.println(estudantes.stream().count());

        //Filtre estudantes com idade igual ou superior a 18 anos
        var estudantesFiltrados = estudantes
                .stream()
                .filter(estudante -> estudante.idade >=18)
                .collect(Collectors.toList());
        System.out.println(estudantesFiltrados);

        //Exiba cada elemento no console
        estudantes.stream().forEach(System.out::println);

        //Retorne estudantes com nome que possui a letra B
        estudantesFiltrados = estudantes.stream()
                .filter(estudante -> estudante.nome.toLowerCase().contains("b"))
                .collect(Collectors.toList());
        System.out.println(estudantesFiltrados);

        //Retorne se existe ao menos um estudante com a letra D no nome
        System.out.println(estudantes.stream().anyMatch(estudante -> estudante.nome.toLowerCase().contains("d")));

        //Retorne o estudante mais velho (maior idade) da coleção. Retorne o mais novo também
        estudantes.stream()
                .max(Comparator.comparingInt(estudade -> estudade.idade))
                .ifPresent(valor -> System.out.println("Mais velho: " + valor.nome));
        estudantes.stream()
                .min(Comparator.comparingInt(estudade -> estudade.idade))
                .ifPresent(valor -> System.out.println("Mais novo: " + valor.nome));
    }
}
