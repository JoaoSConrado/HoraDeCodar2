import java.util.Scanner;

public class Dois {

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  System.out.println("INFORME UM NUMERO: ");
  Float n1 = in.nextFloat();

  if (n1 > 0) {
    System.out.println(n1 + " EH POSITIVO!");
  } 
   if (n1 < 0) {
    System.out.println(n1 + " EH NEGATIVO!");
  } 
   if (n1 == 0) {
    System.out.println(n1 + " EH NULO!");
  } 



 }

}