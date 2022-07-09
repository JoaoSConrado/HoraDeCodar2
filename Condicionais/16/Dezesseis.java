import java.util.Scanner;

public class Dezesseis {
    public static void main(String[] args) {
        int maca;
        double valor = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("INFORME A QUANTIDADE DE MACAS: ");
        maca = in.nextInt();
        if (maca >= 1 && maca < 12){
            valor = maca * 0.30;
            System.out.printf("VOCE COMPROU MENOS DE 12 MACAS, LOGO SAEM POR 0.30 CENTAVOS CADA, O TOTAL DA SUA COMPRA EH: " + valor);
        }else{
            valor = maca * 0.25;
            System.out.printf("VOCE COMPROU MAIS DE 12 MACAS, LOGO SAEM POR 0.25 CENTAVOS CADA, O TOTAL DA SUA COMPRA EH: " + valor);
        }
    }
}