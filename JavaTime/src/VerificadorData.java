import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificadorData {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,06,12);
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data do evento: " + dataEvento.format(formatar));
        System.out.println("Data atual: " + dataAtual.format(formatar));
        if (dataEvento.isBefore(dataAtual)){
            System.out.println("O evento já ocorreu!");
        } else {
            System.out.println("O evento não ocorreu ainda!");
        }
    }
}
