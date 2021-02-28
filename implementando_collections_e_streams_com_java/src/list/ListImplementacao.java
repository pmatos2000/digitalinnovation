package list;

import java.util.ArrayList;
import java.util.Collections;

public class ListImplementacao {
    public static void main(String[] args) {
        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        final var nomes = new ArrayList<String>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes); //[Juliana, Pedro, Carlos, Larissa, João]

        // Navegue na lista exibindo cada nome no console
        for(var nome: nomes){
            System.out.println(nome);
        }

        // Substitua o nome Carlos por Roberto
        final var posCarlos = nomes.indexOf("Carlos");
        nomes.set(posCarlos, "Roberto");
        System.out.println(nomes); //[Juliana, Pedro, Roberto, Larissa, João]

        //Retorno o nome da posição 1
        final var nomePos1 = nomes.get(1);
        System.out.println(nomePos1); //Pedro

        //Remova o nome da posição 4
        final var nomePos4 = nomes.get(4);
        System.out.println(nomePos4); //Larissa

        //Remova o nome João
        nomes.remove("João");
        System.out.println(nomes); //[Juliana, Pedro, Roberto, Larissa]

        //Retorne a quantidade de itens na lista
        final var quantidadesDeNomes =  nomes.size();
        System.out.println(quantidadesDeNomes); //4

        //Verifique se o nome Juliano existe na lista
        final var existeJuliano = nomes.contains("Juliano");
        System.out.println(existeJuliano); //False

        /*
         * Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista
         * criada
         */
        final var nomes2 = new ArrayList<String>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println(nomes2); //[Ismael, Rodrigo]
        nomes.addAll(nomes2);
        System.out.println(nomes); //[Juliana, Pedro, Roberto, Larissa, Ismael, Rodrigo]

        //Ordena os itens da lista em ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes); //[Ismael, Juliana, Larissa, Pedro, Roberto, Rodrigo]

        //Verifique se a lista está vazia
        final var ehVazia = nomes.isEmpty();
        System.out.println(ehVazia); //False
    }
}
