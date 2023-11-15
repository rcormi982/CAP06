/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */
public class EJ01 {
    public static void main(String[] args) {
        System.out.println("Tirada de tres dados");
        int suma=0;
        int tirada;
        for (int i = 1; i <=3; i++) {
            tirada=(int)(Math.random()*6+1);
            System.out.print(tirada + " ");
            suma+=tirada; 
        }
        System.out.println();
        System.out.printf("Suma = %d", suma);
    }
}
