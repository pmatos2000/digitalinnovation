package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementacao {
    public static void main(String[] args) {
        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        var fila = new LinkedList<String>();
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");
        System.out.println(fila); //[Juliana, Pedro, Carlos, Larissa, João]

        //Navegue na fila exibindo cada nome no console.
        for(var cliente: fila){
            System.out.println(cliente);
        }

        //Retorne o primeiro item da fila, sem removê-lo.
        var primeiroDaFila = fila.peek();
        System.out.println(primeiroDaFila); //Juliana
        System.out.println(fila); //[Juliana, Pedro, Carlos, Larissa, João]

        //Retorne o primeiro item da fila, removendo o mesmo.
        primeiroDaFila = fila.poll();
        System.out.println(primeiroDaFila); //Juliana
        System.out.println(fila); //[Pedro, Carlos, Larissa, João]

        //Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
        fila.add("Daniel");
        final var posicaoDaniel = fila.indexOf("Daniel");
        System.out.println(posicaoDaniel); //4
        System.out.println(fila); //[Pedro, Carlos, Larissa, João, Daniel]

        //Retorne o tamanho da lista
        final var tamanhoFila = fila.size();
        System.out.println(tamanhoFila); //5

        //Verifique se a lista está vazia
        final var ehVazia = fila.isEmpty();
        System.out.println(ehVazia); //false

        //Verifique se o nome Carlos está na lista
        final var existeCarlos = fila.contains("Carlos");
        System.out.println(existeCarlos); //true
    }
}
