public class AB_ConcatenacionJava {
    public static void main(String[] args) {
        // Definicion de variables
        var usuario = "Daniel";
        var password = "1234";
        // Impresion de variables de forma individual
        System.out.println("Usuario: " + usuario);
        System.out.println("Password: " + password);
        // Impresion de variables de forma concatenada
        System.out.println("Usuario: " + usuario + " " +"Password: " + password);

        // Definicion de variables con concatenacion 
         var i = 10;
         var j = 20;
         //Concatenacion de variables 
         System.out.println(i+j);//se realiza la suma de numeros
         System.out.println(i + j + usuario);//evaluacion de izq a der, se realiza suma primero si tiene numeros primero.
         System.out.println(usuario + i + j);//contexto cadena, todo lo toma como cadena
         System.out.println(usuario + (i + j));//udo de parentesis, modifica la prioridad en la evaluacion, primero prioriza la suma y luego el resultado de la cadena 


    }
}
