import java.util.Date;

public class DateExemplo {
    public static void main(String[] args) {
        final var tempoEmMilisegundos = 726112800000l;
        final var data = new Date(tempoEmMilisegundos);
        final var data2 = new Date(1271300400000l); // 15 de maio de 2020
        System.out.println(data);
        final var compare = data.compareTo(data2);
        if(compare == -1){
            System.out.println("Data 1 vem antes de Data 2");
        }
        else if( compare == 0){
            System.out.println("As duas datas são iguais");
        }
        else{
            System.out.println("Data 2 vem antes de Data 1");
        }
    }
}
