
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateExemplo {
    public static void main(String[] args) {
        final var data = LocalDateTime.of (2010,5, 15, 0, 0); // 15/05/2010
        final var novaData = data.plusYears(4).plusMonths(6).plusHours(6);
        final var formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(novaData.format(formatacao)); // 15/11/2014 06:00
    }
}
