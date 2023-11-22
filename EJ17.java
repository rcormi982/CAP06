/*Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
*       &   *
* * * * * * * */
public class EJ17 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());

        int posicion = 0;

        int pez =(int) (Math.random()*(altura -2)*(anchura -2));

        for(int i = 1; i <= anchura; i++) {
            System.out.print("*");
        }
        System.out.println();
        // Pinta la parte central
        for(int i = 2; i < altura; i++){
            System.out.print("*"); // parte izquierda de la pecera
            for(int j = 2; j < anchura; j++) {
                if (posicion == pez) {
                    System.out.print("&");
                }else{
                    System.out.print(" ");
                }
            posicion++;
            }
            System.out.println("*"); // parte derecha de la pecera
        }
// Pinta la parte inferior
    for(int i = 1; i <= anchura; i++) {
        System.out.print("*");
    }
  }
}
    

