import java.util.*;

public class Nove {
    public static void main(String[] args) {
        int j = 0, soma = 0;
        List<String> numeros = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        for(int i = 1; i <= 6; i++){
            System.out.printf("INFORME O %d NUMERO: ", i);
            j = in.nextInt();
            if(j < 72){
                soma += j;
            }
            numeros.add(String.valueOf(j));
        }
        System.out.printf("A SOMA DOS NUMEROS INFORMADOS, MENORES QUE 72 EH: %d\n", soma);
        System.out.println("NUMEROS INFORMADOS" + numeros);
    }
}