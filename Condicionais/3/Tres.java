import java.util.Scanner;

public class Tres {

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  System.out.println("INFORME O PRIMEIRO NUMERO: ");
  Float n1 = in.nextFloat();
  System.out.println("INFORME O SEGUNDO NUMERO: ");
  Float n2 = in.nextFloat();
  System.out.println("INFORME O TERCEIRO NUMERO: ");
  Float n3 = in.nextFloat();

  if (n1 > n2 && n1 > n3 ) {
  System.out.println(n1 + " EH O MAIOR NUMERO!");
 } else if (n2 > n1 && n2 > n3 ) {
  System.out.println(n2 + " EH O MAIOR NUMERO!");
 } else  {
  System.out.println(n3 + " EH O MAIOR NUMERO!");
 }

}

}