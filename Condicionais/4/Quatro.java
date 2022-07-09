import java.util.Scanner;

public class Quatro {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("INFORME O PRIMEIRO NUMERO: ");
    Float n1 = in.nextFloat();
    System.out.println("INFORME O SEGUNDO NUMERO: ");
    Float n2 = in.nextFloat();
    System.out.println("INFORME O TERCEIRO NUMERO: ");
    Float n3 = in.nextFloat();

    if (n1 < n2 && n1 < n3) {
      System.out.println("A SOMA DOS 2 MAIORES EH: " + (n2 + n3));
    }

    else if (n2 < n1 && n2 < n3) {
      System.out.println("A SOMA DOS 2 MAIORES EH: " + (n1 + n3));
    }

    else if (n3 < n1 && n3 < n2) {
      System.out.println("A SOMA DOS 2 MAIORES EH: " + (n2 + n1));
    }


  }

}