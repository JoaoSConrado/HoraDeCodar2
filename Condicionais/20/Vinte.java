import java.util.Scanner;

public class Vinte {
    public static void main(String[] args) {
        int lados;
        double per, med;

        Scanner in = new Scanner(System.in);
        System.out.println("INFORME OS LADOS DO SEU POLIGONO: ");
        lados = in.nextInt();
        System.out.println("INFORME A MEDIDA EM CM: ");
        med = in.nextDouble();

        if(lados == 3){
            per = 3 * med;
            System.out.println("EH UM TRIANGULO DE PERIMETRO: "+ per);
        }else if (lados == 4) {
            per = 4 * med;
            System.out.println("EH UM QUADRADO DE PERIMETRO: " + per);
        }else if(lados == 5){
            per = 5 * med;
            System.out.println("EH UM PENTAGONO DE PERIMETRO: "+ per);
        }else if(lados < 3){
            System.out.println("MENOS DE 3 LADOS NAO EH UM POLIGONO");
        }else{
            System.out.println("EH UM POLIGONO NAO IDENTIFICADO");
        }
    }
}