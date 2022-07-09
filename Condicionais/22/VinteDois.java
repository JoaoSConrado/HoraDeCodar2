import java.util.Scanner;

public class VinteDois {
    public static void main(String[] args) {
        double vParcelas = 0;
        int p;
        Scanner in = new Scanner(System.in);
        System.out.println("INFORME EM QUANTAS PARCELAS VOCE DESEJA PAGAR:  ");
        p = in.nextInt();

        if (p > 15){
            System.out.println("O LIMITE DE PARCELAS EH 15!");
        }
        else {
            vParcelas = 18.230 / p;
        }
        System.out.printf("PARCELADO EM " + p + "x VOCE PAGARA R$ " + vParcelas + " NAS PARCELAS");
    }
}