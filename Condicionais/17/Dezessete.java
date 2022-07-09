import java.util.Scanner;

public class Dezessete {
    public static void main(String[] args) {
        int senha = 1234;

        Scanner in = new Scanner(System.in);

        System.out.println("INFORME A SENHA: ");
        senha = in.nextInt();
        while(senha != 1234){
            System.out.println("ACESSO NEGADO! TENTE NOVAMENTE: ");
            senha = in.nextInt();
        }
        if (senha == 1234){
            System.out.println("ACESSO PERMITIDO!");
        }
    }
}