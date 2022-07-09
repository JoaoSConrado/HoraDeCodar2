import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args) {
         int sexo;
         double imc, h;
         Scanner in = new Scanner(System.in);

        System.out.println("[1] MASCULINO -- [2] FEMININO");
        sexo = in.nextInt();
        System.out.println("INFORME A SUA ALTURA: ");
        h = in.nextDouble();

        if (sexo == 1){
            imc = (72.7 * h) - 58;
            System.out.printf("SEU PESO IDEAL SERIA: " + imc + " Kg");
        }else{
            imc = (62.1 *h) - 44.7;
            System.out.printf("SEU PESO IDEAL SERIA: " + imc + " Kg");
        }
    }
}