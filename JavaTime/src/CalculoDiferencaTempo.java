import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class CalculoDiferencaTempo {
    public static void main(String[] args) {
        Scanner lerTempo = new Scanner(System.in);
        System.out.print("Insira o horário de INÍCIO da atividade(no formato HH:mm:ss): ");
        LocalTime inicio = LocalTime.parse(lerTempo.nextLine());
        System.out.print("Insira o horário de FIM da atividade(no formato HH:mm:ss): ");
        LocalTime fim = LocalTime.parse(lerTempo.nextLine());
        Duration tempo = Duration.between(inicio, fim);
        if (tempo.toSecondsPart() == 0){
            if (tempo.toMinutesPart() == 0){
                if (tempo.toHours() == 1){
                    System.out.println("Diferença de tempo: " + tempo.toHours() + " hora.");
                }else {
                    System.out.println("Diferença de tempo: " + tempo.toHours() + " horas.");
                }
            }
        } else {
            System.out.println("Diferença de tempo: " + tempo.toHours() + " horas  e " + tempo.toMinutesPart() + " minutos e " + tempo.toSecondsPart() + " segundos.");
        }
    }
}
