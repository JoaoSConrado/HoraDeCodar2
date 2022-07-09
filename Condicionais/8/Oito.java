import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        int n , soma = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.printf("INFORME O %d NUMERO: ", i);
            n = in.nextInt();
            soma += n;
        }
        System.out.printf("A SOMA DOS NUMEROS INFORMADOS EH: " + soma);
    }
}