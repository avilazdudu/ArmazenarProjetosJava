import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 7, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento!");
        } else {
            System.out.println("Ainda não é o dia do vencimento!");
        }
        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterior ao dia do vencimento!");
        } else {
            System.out.println("Superior ao dia do vencimento!");
        }
        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoDeCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra formatada: " + dataConclusaoDeCompra);
        ZonedDateTime dataConclusaoDeCompraNY = dataConclusaoDeCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra NY: " + dataConclusaoDeCompraNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("A duração do expediente é " + duracao.toHours()
                + " horas e " + duracao.toMinutesPart() + " minutos. ");
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());
    }
}