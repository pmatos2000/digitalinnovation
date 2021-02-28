package comparators;


import java.util.*;

public class ComparatorsImplementacao {
    public static class Aluno implements Comparable<Aluno>{
        String nome;
        double nota1;
        double nota2;
        private Aluno aluno;

        public Aluno(String nome, double nota1, double nota2){
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public double media(){
            return (nota1 + nota2)/2.0;
        }

        @Override
        public String toString() {
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    "media=" + media() +
                    ", nota1=" + nota1 +
                    ", nota2=" + nota2 + '}';
        }

        //Ordena pela media em caso de empate olha a nota 1
        @Override
        public int compareTo(Aluno aluno) {
            this.aluno = aluno;
            double diferencaEntreMedias = this.media() - aluno.media();
            if(Math.abs(diferencaEntreMedias)  < 1e-3){
                double diferencaEntreNota1 = this.nota1 - aluno.nota1;
                if(Math.abs(diferencaEntreNota1)  < 1e-3) {
                    return 0;
                }
                else if(this.nota1 < aluno.nota1){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else if(diferencaEntreMedias < 0){
                return 1;
            }
            else{
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        //Adicione elemento nessa lista
        final var alunos = new Vector<Aluno>();
        alunos.add(new Aluno("Katia", 9.0, 9.0));
        alunos.add(new Aluno("Paulo", 10.0, 10.0));
        alunos.add(new Aluno("Lucas", 8.0, 8.0));
        alunos.add(new Aluno("Hebert", 10.0, 6.0));
        alunos.add(new Aluno("Stefany", 6.0, 10.0));
        alunos.add(new Aluno("Fabiana", 10.0, 0.0));
        System.out.println(alunos);

       //Ordena implementando a interface java.util.Comparator no seu objeto
        Collections.sort(alunos, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno aluno, Aluno t1) {
                //Ordena pelo nome
                return aluno.nome.compareTo(t1.nome);
            }
        });
        System.out.println(alunos);

        //Ordene implementando um novo objeto com a interface java.util.Comparable
        Collections.sort(alunos); //Ordena pela media em caso de empate olha a nota 1
        System.out.println(alunos);

        //Ordene usando uma expressão lambda na chamada de suaLista.sort()
        alunos.sort((aluno1, aluno2) -> {
            double dif = aluno2.nota1 - aluno1.nota1;
            if(dif > 0) return 1;
            if(dif < 0) return -1;
            return 0;
        });
        System.out.println(alunos);
        //Ordene usando referência de métodos e os métodos estáticos de Comparator
        alunos.sort(Comparator.comparingDouble(Aluno::media).reversed()); //Ordena pela media
        System.out.println(alunos);

        //Ordene coleções TreeSet e TreeMap
        Collections.shuffle(alunos); //Randomiza a posições dos alunos
        System.out.println(alunos);

        final var treeSet = new TreeSet<Aluno>(alunos);
        System.out.println(treeSet);

        final var treeMap = new TreeMap<Aluno, Double>();
        for(var aluno: alunos){
            treeMap.put(aluno, aluno.media());
        }
        System.out.println(treeMap);
    }
}
