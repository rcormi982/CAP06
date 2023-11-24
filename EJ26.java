/*Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
Ejemplo 1:
Introduzca la anchura de la tableta: 6
Introduzca la altura de la tableta: 4
******
*****
******
******
Ejemplo 2:
Introduzca la anchura de la tableta: 7
Introduzca la altura de la tableta: 3
*******
*******
******
Ejemplo 3:
Introduzca la anchura de la tableta: 5
Introduzca la altura de la tableta: 5
** **
*****
*****
*****
***** */
public class EJ26 {
    public static void main(String[] args) {
        System.out.println("Programa que pinta tableta de turrón y se le da un mordisco aleatoriamente");
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());

        int posicionMordisco = (int) (Math.random() * (anchura * 2 + (altura - 2) * 2));
        int posicion = 0;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                boolean estaEnBorde = (i == 1) || (i == altura) || (j == 1) || (j == anchura);
                if ((posicion == posicionMordisco) && estaEnBorde) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (estaEnBorde) {
                    posicion++;
                }
            }
            System.out.println();
        }
    }       
}

