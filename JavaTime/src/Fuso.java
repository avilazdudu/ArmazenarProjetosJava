import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Fuso {
    public static void main(String[] args) {
        ZonedDateTime horaAtual = ZonedDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime horaTokyo = horaAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Horário atual: " + horaAtual.format(formato));
        System.out.println("Horário atual em Tóquio: " + horaTokyo.format(formato));
    }
}
