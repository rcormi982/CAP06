public class EJ03 {
/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

public static String obtenPalo(){
    String paloString ="";
    int palo = (int)(Math.random()*4 + 1);
    switch (palo) {
        case 1:
            paloString = "oro";
            break;
        case 2:
            paloString = "espada";
            break;
        case 3:
            paloString = "copa";
            break;
        case 4:
            paloString = "bastos";
            break;
        default:
            break;
        }
    return paloString;
}
public static String obtenCarta(){
    String cartaString ="";
    int carta = (int)(Math.random()*10 + 1);
    switch (carta) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                cartaString = carta + "";
                break;
            case 8:
                cartaString = "sota";
                break;
            case 9:
                cartaString = "caballo";
                break;
            case 10:
                cartaString = "rey";
                break;
            default:
                break;
        }
    return cartaString;
}
public static void main(String[] args) {
    String paloString=obtenPalo();
    String cartaString=obtenCarta();

    System.out.printf("%s de %s", cartaString, paloString);
    }
}
