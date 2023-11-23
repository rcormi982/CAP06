/*Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7
Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0 */
public class EJ24 {
    public static void main(String[] args) {
        System.out.println("Programa que al introducir un número elige al azar uno de sus dígitos.");
        System.out.print("Por favor, introduzca un número: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido;
        int longitud = 0;

        while(numero > 0){
            numero /=10;
            longitud++;
        }
        int posicion = (int)(Math.random() * longitud) + 1;
        
        System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);//Preguntar
    }
}
