/**
 * 1_TiposDeDatos
 */
public class A_TiposDeDatos {

    public static void main(String[] args) {
         //definir variables
         int entera = 10;
         System.out.println(entera);
         //(1.0) Pueden modificar variables, reutilizar el valor 
         entera = 20;
         System.out.println(entera);

         //definir variable string y ejecutar
         String cadena = "Cadena Hola Mundo";
         System.out.println(cadena);

         cadena = "adios";
         System.out.println(cadena);

         //definir variable float
         float flotante = 10.5f;
         System.out.println(flotante);

         //(2.0)definir variable var 
         var especial = 10;
         System.out.println(especial);
         System.out.println("concatenacion int con var"+especial);
        
         var especial2 = "Hola";
         System.out.println(especial2);
         System.out.println("concatenacion string con var"+especial);

         var especial3 = 10.5f;
         System.out.println(especial3);
         System.out.println("concatenacion floatcon var"+especial);
             
         
    }//fin del main
}//fin de la clase