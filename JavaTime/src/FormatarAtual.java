import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatarAtual {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horarioAtual = LocalTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatarHorario = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Data formatada: " + dataAtual.format(formatarData));
        System.out.println("Horário formatado: " + horarioAtual.format(formatarHorario));
    }
}
