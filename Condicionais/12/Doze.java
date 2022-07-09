import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        double tamPista, gasConsu, circuitoTotalKm, litroMin, litroTotal;
        int reabas, numVolta;
        Scanner in = new Scanner(System.in);

        System.out.println("INFORME O TAMANHO DA PISTA EM METROS: ");
        tamPista = in.nextDouble();
        System.out.println("INFORME A QUANTIDADE DE VOLTAS: ");
        numVolta = in.nextInt();
        System.out.println("INFORME A QUANTIDADE DESEJADA DE REABASTECIMENTOS: ");
        reabas = in.nextInt();
        System.out.println("INFORME O CONSUMO DE COMBUSTIVEL DO CARRO: ");
        gasConsu = in.nextDouble();

        circuitoTotalKm = (tamPista * numVolta) / 1000;
        litroMin = (circuitoTotalKm / reabas) / gasConsu;
        litroTotal = circuitoTotalKm / gasConsu;

        System.out.println("MINIMO DE LITROS PARA A PRIMEIRA PARADA:" + litroMin);
        System.out.println("TAMANHO DO CIRCUITO: " + circuitoTotalKm + " Km");
        System.out.println("TOTAL DE LITROS NECESSARIOS: "+ litroTotal);

    }
}