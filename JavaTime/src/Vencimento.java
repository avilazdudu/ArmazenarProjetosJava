import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vencimento {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        int numeroDeMesesAdicionais = 2;
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate novaDataVencimento = dataAtual.plusMonths(numeroDeMesesAdicionais);
        System.out.println("Nova data de vencimento: "+ novaDataVencimento.format(formatar));
    }
}
