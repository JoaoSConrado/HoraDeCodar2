import java.util.Scanner;

public class Quinze {
    public static void main(String[] args) {
        int idade, ano;

        Scanner in = new Scanner(System.in);

        System.out.println("INFORME O ANO DE SEU NASCIMENTO: ");
        ano = in.nextInt();
        idade = 2022 - ano;
        if (idade >= 16){
            System.out.println("VOCE JA PODE VOTAR!");
        }else{
            System.out.println("NAO PODE VOTAR AINDA");
        }
    }
}