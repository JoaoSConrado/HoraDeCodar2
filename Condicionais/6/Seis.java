import java.util.Scanner;

public class Seis {

 public static void main(String[] args) {

  int i, soma = 0, media = 0;

  Scanner in = new Scanner(System.in);

  for( i = 0; i < 10; i++) {
    System.out.println("INFORME O NUMERO: ");
    Float n = in.nextFloat();
    soma += n;
  }

  media = (soma/10);

  System.out.println("A SOMA DOS NUMEROS INFORMADOS EH:" + soma);
  System.out.println("A MEDIA ARITMETICA DOS NUMEROS EH:" + media);

}

}