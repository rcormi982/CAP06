/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */
public class EJ05 {
    public static void main(String[] args) {
        System.out.println("Muestra 50 números aleatorios entre 100 y 199: ");
        int maximo = 100;
        int minimo = 199;
        int numero;
        int suma = 0;
        
        for (int i = 1; i <=50; i++) {
            numero= (int)(Math.random()*100 + 100); 
            System.out.print(numero + " ");
            suma +=numero;
            if(numero < minimo){
                minimo = numero;
            } 
            if(numero > maximo){
                maximo = numero;
            }
        }
        System.out.println();
        System.out.printf("Mínimo: %d%nMáximo: %d%nMedia: %.2f", minimo, maximo, (double)suma/50);
    }
}
