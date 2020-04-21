import java.util.Scanner;

public class Scanner{
  public static void main(String args[]){
  
   Scanner teclado = new Scanner(System.in);
   String nombre = "";
   int num_uno = 0;
   int num_dos = 0;
   int resultado = 0;

   System.out.println("¿Cual es tu nombre?");
   nombre = teclado.nextLine();

   System.out.println("Dame el primer valor para tu suma:");
   num_uno = teclado.nextInt();

   System.out.println("Dame el segundo valor para tu suma:");
   num_uno = teclado.nextInt();

   resultado = num_uno + num_dos;

   System.out.println("Hola " + nombre + " el resultado de tu suma es " + resultado);
 }
}