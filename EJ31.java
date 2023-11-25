/*Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando. */
public class EJ31 {
    public static void main(String[] args) {
        System.out.println("Juego del Craps");
        System.out.print("Introduce la cantidad de dinero que quieres apostar: ");
        int apuesta = Integer.parseInt(System.console().readLine());

        int dado1 =(int)(Math.random()*6+1);
        int dado2 =(int)(Math.random()*6+1);

        int suma1 = dado1 + dado2;
        System.out.printf("La tirada de los dados es: %d %d%n", dado1, dado2);
        System.out.printf("La suma de los dos dados es: %d%n", suma1);

        if(suma1==7 || suma1==11){
            apuesta = apuesta * 2;
            System.out.printf("Ha ganando %d: ", apuesta);
        }else if(suma1==2 || suma1==3 || suma1==12){
            apuesta=0;
            System.out.println("Lo siento, ha perdido todo su dinero");
        }else{
            boolean finPartida = false;
            System.out.print("Pulse INTRO para volver a tirar los dados: ");
            System.console().readLine();
            while (!finPartida) {
                int dado11 =(int)(Math.random()*6+1);
                int dado22 =(int)(Math.random()*6+1);
                System.out.printf("La tirada de los dados es: %d %d%n", dado11, dado22);
                System.out.printf("Ha obtenido: %d%n", (dado11+dado22));

                if(suma1 == dado11 + dado22 ){
                    System.out.println("Enhorabuena has duplicado tu apuesta: " + 2*apuesta);
                    finPartida = true;
                }else if(dado11 + dado22 == 7){
                    System.out.println("Lo siento has perdido todo tu dinero");
                    finPartida = true;
                }else{
                    dado11 =(int)(Math.random()*6+1);
                    dado22 =(int)(Math.random()*6+1);
                    System.out.print("Pulse INTRO para volver a tirar los dados");
                    System.console().readLine();
                }
            }
        }
    }    
}
