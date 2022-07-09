import java.util.Scanner;

public class Treze {
    public static void main(String[] args) {
        double nota, soma = 0, media = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 4; i++){
            System.out.printf("INFORME A SUA %d NOTA: ",i);
            nota = in.nextDouble();
            while(nota < 0 || nota > 10){
                System.out.println("INFORME UM VALOR QUE SEJA ENTRE 0 a 10: ");
                nota = in.nextDouble();
            }
            soma += nota;
            media = soma / 4;
        }
        if (media >= 6.0){
            System.out.println("PARABENS! VOCE FOI APROVADO COM MEDIA: " + media);
        }else{
            System.out.println("INFELIZMENTE, VOCE FOI REPROVADO COM A MEDIA: " + media);
        }
    }
}