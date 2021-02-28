package set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetImplementacao {
    public static void main(String[] args) {
        //Adicione 5 números inteiros: 3, 88, 20, 44, 3
        final var hashSet = new HashSet<Integer>();
        hashSet.add(3);
        hashSet.add(88);
        hashSet.add(20);
        hashSet.add(44);
        hashSet.add(3);
        System.out.println(hashSet); //[3, 20, 88, 44]

        //Navegue no set exibindo cada número no console
        for(var num: hashSet){
            System.out.println(num);
        }

        //Remova o primeiro item do set
        hashSet.remove(3);
        System.out.println(hashSet); //[20, 88, 44]

        //Adiciona um novo número no Set: 23
        hashSet.add(23);
        System.out.println(hashSet); //[20, 23, 88, 44]

        //Verifique o tamanho do Set
        System.out.println(hashSet.size()); //4

        //Verifique se o Set está vazio
        System.out.println(hashSet.isEmpty()); //false

        //-----------------------------------------------------------------------

        //Adicione 5 números inteiros: 3, 88, 20, 44, 3
        final var linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(3);
        linkedHashSet.add(88);
        linkedHashSet.add(20);
        linkedHashSet.add(44);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet); //[3, 88, 20, 44]

        //Navegue no set exibindo cada número no console
        for(var num: linkedHashSet){
            System.out.println(num);
        }

        //Remova o primeiro item do set
        linkedHashSet.remove(3);
        System.out.println(linkedHashSet); //[88, 20, 44]

        //Adiciona um novo número no Set: 23
        linkedHashSet.add(33);
        System.out.println(linkedHashSet); //[88, 20, 44, 33]

        //Verifique o tamanho do Set
        System.out.println(linkedHashSet.size()); //4

        //Verifique se o Set está vazio
        System.out.println(linkedHashSet.isEmpty()); //false

        //-----------------------------------------------------------------------
        //Adicione 5 números inteiros: 3, 88, 20, 44, 3
        final var treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(20);
        treeSet.add(88);
        treeSet.add(44);
        treeSet.add(3);
        System.out.println(treeSet); //[3, 20, 44, 88]

        //Navegue no set exibindo cada número no console
        for(var num: treeSet){
            System.out.println(num);
        }

        //Remova o primeiro item do set
        treeSet.pollFirst();
        System.out.println(treeSet); //[20, 44, 88]

        //Adiciona um novo número no Set: 23
        treeSet.add(23);
        System.out.println(treeSet); //[20, 23, 44, 88]

        //Verifique o tamanho do Set
        System.out.println(treeSet.size()); //4

        //Verifique se o Set está vazio
        System.out.println(treeSet.isEmpty()); //false

    }
}
