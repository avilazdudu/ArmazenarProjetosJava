import java.time.LocalDate;

public class Lembrete {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 06, 16);
        LocalDate lembrete = dataVencimento.minusDays(10);
        System.out.println("Data do lembrete: " + lembrete);
    }
}
