// import java.util.Scanner;

// public class Sete {

//  public static void main(String[] args) {

//   int maior;

//   Scanner in = new Scanner(System.in);

//   System.out.println("INFORME O PRIMEIRO NUMERO: ");
//   Float num1 = in.nextFloat();

//   System.out.println("INFORME O SEGUNDO NUMERO: ");
//   Float num2 = in.nextFloat();

//   System.out.println("INFORME O TERCEIRO NUMERO: ");
//   Float num3 = in.nextFloat();

//   System.out.println("INFORME O QUARTO NUMERO: ");
//   Float num4 = in.nextFloat();

//   if (num1 > num2 && num1 > num3 && num1 > num4){
//     maior = num1;
//   }else if (num2 > num1 && num2 > num3 && num2 > num4){
//     maior = num2;
//   }else if (num3 > num1 && num3 > num2 && num3 > num4){
//     maior = num3;
//   }else{
//     maior = num4;
//   }


  
//   System.out.println("O PRIMEIRO NUMERO EH: " + num1);
//   System.out.println("O ULTIMO NUMERO EH: " + num4);
//   System.out.println("O MAIOR NUMERO EH: " + maior);


// }
// }

import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        int n1, n2, n3, n4, maior;

        Scanner in = new Scanner(System.in);

        System.out.println("INFORME O PRIMEIRO NUMERO: ");
        n1 = in.nextInt();
        System.out.println("INFORME O SEGUNDO NUMERO: ");
        n2 = in.nextInt();
        System.out.println("INFORME O TERCEIRO NUMERO: ");
        n3 = in.nextInt();
        System.out.println("INFORME O QUARTO NUMERO: ");
        n4 = in.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4){
            maior = n1;
        }else if (n2 > n1 && n2 > n3 && n2 > n4){
            maior = n2;
        }else if (n3 > n1 && n3 > n2 && n3 > n4){
            maior = n3;
        }else{
            maior = n4;
        }
        
      System.out.println("O PRIMEIRO NUMERO EH: " + n1);
      System.out.println("O ULTIMO NUMERO EH: " + n4);
      System.out.println("O MAIOR NUMERO EH: " + maior);

    }
}