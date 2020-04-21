public class Condiciones{
  public static void main(String args []){
  
   int sistemas = 9;
   int montaje = 7;
   int redes = 8;
   int promedio = 0;

   promedio = (sistemas + montaje + redes) / 3;

   if(promedio >= 5){
     System.out.println("El alumno aprobo " + promedio);
   } else {
     System.out.println("El alumno suspendio " + promedio);
   }
 }
}