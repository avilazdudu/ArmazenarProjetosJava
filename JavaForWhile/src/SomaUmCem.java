public class SomaUmCem {
    public static void main(String[] args) {
        int somaDos100 = 0;
        for (int i = 0; i < 101 ; i++) {
            if (i % 2 == 0){
                somaDos100 += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: "+ somaDos100);
    }
}
