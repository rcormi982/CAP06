/*Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. */
public class EJ19 {
    public static void main(String[] args) {
        System.out.println("Números aleatorios entre -100 y 200");
        int maximoPar = Integer.MIN_VALUE;
        int minimoImpar = Integer.MAX_VALUE;
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            int numero = (int)(Math.random()*(301)-100);
            System.out.print( numero + " ");
            if(numero % 2 ==0 && numero > maximoPar){
                maximoPar = numero;
            }
            if(numero % 2 !=0 && numero < minimoImpar){
                minimoImpar = numero;
            }
            suma+= numero; 
        }
        System.out.println();
        System.out.printf("El máximo de los números pares es %d%n", maximoPar);
        System.out.printf("El mínimo de los números impares es %d%n", minimoImpar);
        System.out.println("La media de todos los números generados es: " + (double)suma/50);
    }
}
