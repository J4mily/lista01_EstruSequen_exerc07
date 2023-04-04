import java.util.Scanner;

public class lista01_EstruSequen_exerc07 {
    //7.Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
   public static void main(String args[]){
       
    Scanner val = new Scanner(System.in);
  
    System.out.print("Qual o valor de um dos lados do quadrado? ");
    float vlQuadrado = val.nextFloat();

     System.out.println("> A área do quadrado é: " + (vlQuadrado * vlQuadrado));
     System.out.println("> O dobro dessa área correesponde a: " + (vlQuadrado * vlQuadrado)*2);

     val.close();
}
}
