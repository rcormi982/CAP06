public class EJ02 {
/*Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar */
    public static void main(String[] args) {
        String paloString ="";
        String cartaString ="";
        int palo = (int)(Math.random()*4 + 1);
        int carta = (int)(Math.random()*13 + 1);

        switch (palo) {
            case 1:
                paloString = "diamante";
                break;
            case 2:
                paloString = "picas";
                break;
            case 3:
                paloString = "corazones";
                break;
            case 4:
                paloString = "tréboles";
                break;
            default:
                break;
        }
        switch (carta) {
            case 1:
                cartaString = "as";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                cartaString = carta+"";
                break;
            case 11:
                cartaString = "J";
                break;
            case 12:
                cartaString = "Q";
                break;
            case 13:
                cartaString = "K";
                break;
            default:
                break;
        }

        System.out.printf("%s de %s", cartaString, paloString);

    }
}
