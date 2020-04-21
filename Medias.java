import java.util.Scanner;

public class Medias{
  public static void main(String args[]){
  
  Scanner teclado = new Scanner(System.in);
  float nota1 = 0;
  float nota2 = 0;
  float nota3 = 0;

  float nota = 0;

  System.out.println("Cuanto sacaste en el primer examen?");
  nota1 = teclado.nextFloat();

  System.out.println("Cuanto sacaste en el segundo examen?");
  nota2 = teclado.nextFloat();

  System.out.println("Cuanto sacaste en el tercer examen?");
  nota3 = teclado.nextFloat();

  nota = (nota1 + nota2 + nota3) / 3;

  System.out.println("Tu nota final es " + nota);
 }
}