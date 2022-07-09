import java.util.Scanner;

public class Cinco {

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  System.out.println("INFORME O PRIMEIRO NUMERO: ");
  Float n1 = in.nextFloat();
  System.out.println("INFORME O SEGUNDO NUMERO: ");
  Float n2 = in.nextFloat();

  if (n1 > n2) {
  System.out.println("O MAIOR NUMERO, EH O PRIMEIRO!");
 } else if (n2 > n1) {
  System.out.println("O MAIOR NUMERO, EH O SEGUNDO!");
 } else {
  System.out.println("OS NUMEROS SAO IGUAIS!");
 }

}

}