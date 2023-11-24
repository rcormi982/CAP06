/*Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
Ejemplo 1:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: papel
Empate
Ejemplo 2:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: tijera
Gana el ordenador
Ejemplo 3:
Turno del jugador (introduzca piedra, papel o tijera): piedra
Turno del ordenador: tijera
Gana el jugador */
public class EJ27 {
    public static void main(String[] args) {
        System.out.println("Juego de piedra, papel o tijera.");
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugador = System.console().readLine();
        int mano =(int)(Math.random()*3 + 1);
        String ordenador = "";

        switch (mano) {
            case 1:
                ordenador = "piedra";
                break;
            case 2:
                ordenador = "papel";
                break;
            case 3:
                ordenador = "tijera";
                break;
            default:
                break;
        }
        System.out.println("Turno del ordenador: " + ordenador);
        if(jugador.equals(ordenador)){
            System.out.println("Empate");
        }else{
            int ganador = 2;
            switch (jugador) {
                case "piedra":
                    if(ordenador.equals("tijera")){
                        ganador = 1;
                    }
                    break;
                case "papel":
                    if(ordenador.equals("piedra")){
                        ganador = 1;
                    }
                    break;
                case "tijera":
                    if(ordenador.equals("papel")){
                        ganador = 1;
                    }
                    break;
                default:
                    System.out.println("Error. Inténtelo de nuevo");
                    break;
            }
            if (ganador == 1) {
                System.out.println("Gana el jugador");
            }else {
                System.out.println("Gana el ordenador");
            }
        }
    }
}
