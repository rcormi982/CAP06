/*Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua. */
public class EJ20 {
    public static void main(String[] args) {
        System.out.println("Pintar cuba de agua");
        System.out.print("Por favor introduce la capacidad de la cuba en litros: ");
        int capacidad = Integer.parseInt(System.console().readLine());
        int litros = (int)(Math.random()*capacidad+1);
        for (int i = 0; i < capacidad; i++) {
            if (i < capacidad - litros) {
                System.out.print("*    *");
            }else{
                System.out.print("*====*");

            } 
            System.out.println();
        }
        System.out.println("******");
        System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua", capacidad, litros);        
    }
}
