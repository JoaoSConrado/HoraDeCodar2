import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        double nota = 0;
        double media = 0, soma = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 4; i++){
            System.out.printf("INFORME A SUA %d NOTA: ",i);
            nota = in.nextDouble();
            while(nota < 0 || nota > 10){
                System.out.println("INFORME UM VALOR DE 0 a 10: ");
                nota = in.nextDouble();
            }
            soma += nota;
            media = soma / 4;
        }
        if (media > 5){
            System.out.println("VOCE PASSOU NO TESTE COM "+ media +" DE MEDIA! ");
        }else{
            System.out.println("TENTE NOVAMENTE!");
        }
    }
}