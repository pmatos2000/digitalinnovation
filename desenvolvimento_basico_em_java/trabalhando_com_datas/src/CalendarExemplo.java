import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExemplo {
    private static int obterQuantidadesDeDias(Calendar dataVencimento){
        final var dataPagamento = (Calendar) dataVencimento.clone();
        dataPagamento.add(Calendar.DATE, 10);
        final var diaDaSemana = dataPagamento.get(Calendar.DAY_OF_WEEK);
        if(diaDaSemana == Calendar.SATURDAY){  //Sabado
            return 12;
        }
        else if(diaDaSemana == Calendar.SUNDAY){
            return 11;
        }
        else{
            return 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(obterQuantidadesDeDias(new GregorianCalendar(2021,Calendar.MARCH,2))); // 10
        System.out.println(obterQuantidadesDeDias(new GregorianCalendar(2021,Calendar.MARCH,3))); // 12
        System.out.println(obterQuantidadesDeDias(new GregorianCalendar(2021,Calendar.MARCH,4))); // 11
        System.out.println(obterQuantidadesDeDias(new GregorianCalendar(2021,Calendar.MARCH,5))); // 10
    }
}
