/*Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As 7 */
public class EJ23 {
    public static void main(String[] args) {
        System.out.println("Caras de 5 dados de póker");
        String cara = "";
        for (int i = 1; i <=5; i++) {
            switch ((int)(Math.random()*6+1)) {
                case 1:
                    cara = "As";
                    break;
                case 2:
                    cara = "K";
                    break;
                case 3:
                    cara = "Q";
                    break;
                case 4:
                    cara = "J";
                    break;
                case 5:
                    cara = "7";
                    break;
                case 6:
                    cara = "8";
                    break;
                default:
                    break;
            }
        System.out.print(cara + " ");
        }
    }
}
