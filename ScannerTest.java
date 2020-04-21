import java.util.Scanner;

public class ScannerTest{
  public static void main(String args[]){
  
   Scanner teclado = new Scanner(System.in);
   String nombre = "";
   float num_uno = 0;
   float num_dos = 0;
   float resultado = 0;

   float operacion = 0;

   System.out.println("Cual es tu nombre");
   nombre = teclado.nextLine();

   System.out.println("Dame el primer valor para tu operacion:");
   num_uno = teclado.nextFloat();

   System.out.println("Dame el segundo valor para tu operacion:");
   num_dos = teclado.nextFloat();

   System.out.println("Elije que operacion realizar:");
   System.out.println("1.Suma");
   System.out.println("2.Resta");
   System.out.println("3.Multiplicacion");
   System.out.println("4.Division");
   operacion = teclado.nextInt();

   if(operacion == 1){
   resultado = num_uno + num_dos;
   System.out.println("Hola " + nombre + ", el resultado de tu suma es " + resultado);
   } else if(operacion == 2){
   resultado = num_uno - num_dos;
   System.out.println("Hola " + nombre + ", el resultado de tu resta es " + resultado);
   } else if(operacion == 3){
   resultado = num_uno * num_dos;
   System.out.println("Hola " + nombre + ", el resultado de tu multiplicacion es " + resultado);
   } else if(operacion == 4){
   resultado = num_uno / num_dos;
   System.out.println("Hola " + nombre + ", el resultado de tu division es " + resultado);
   } else {
   System.out.println("La opcion seleccionada no es correcta");
   }
 }
}