import java.util.Scanner;

public class Dezenove {
    public static void main(String[] args) {
        int g, i;

        Scanner in = new Scanner(System.in);

        System.out.println("INFORME OS GOLS DO GREMIO: ");
        g = in.nextInt();
        System.out.println("INFORME OS GOLS DO INTER: ");
        i = in.nextInt();

        if (g == i){
            System.out.println("EMPATE");
        }else if(g > i){
            System.out.println("GREMIO GANHOU!");
        }else{
            System.out.println("INTER GANHOU!");
        }
    }
}