import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o primeiro numero:");
        double numeroA = entrada.nextDouble();
        System.out.println("insira o segundo numero:");
        double numeroB = entrada.nextDouble();
        System.out.println("insira o terceiro numero:");
        double numeroC = entrada.nextDouble();

        if(numeroA < numeroB && numeroA < numeroC){
            System.out.println(numeroB + numeroC);
        } else if(numeroB < numeroA && numeroB < numeroC){
            System.out.println(numeroA + numeroC);
        }else {
            System.out.println(numeroB + numeroA);
        }

    }
}