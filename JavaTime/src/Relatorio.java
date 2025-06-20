import java.time.LocalDate;
import java.time.LocalTime;


public class Relatorio {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal!";
        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();
        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data atual: " + dataCriacao);
        System.out.println("Hora atual: " + horaCriacao);
    }
}
