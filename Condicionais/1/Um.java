import java.util.Scanner;

public class Um {

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  System.out.println("INFORME O PRIMEIRO NUMERO: ");
  Float n1 = in.nextFloat();
  System.out.println("INFORME O SEGUNDO NUMERO: ");
  Float n2 = in.nextFloat();

  if (n1 > n2) {
    System.out.println(n1 + " EH O MAIOR NUMERO!");
  } else {
     System.out.println(n2 + " EH O MAIOR NUMERO!");
  }

 }

}