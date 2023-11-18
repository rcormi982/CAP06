/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. */
public class EJ06 {
    public static void main(String[] args) {
        System.out.println("Programa que piensa un número al azar");
        int oportunidades = 5;
        int numeroOculto = (int)(Math.random()*100 + 1);
        int numero;
        boolean acertado = false;
        do {
            System.out.print("Piensa un número entre el 0 y el 100: ");
            numero = Integer.parseInt(System.console().readLine());
            oportunidades--;

            if(numero > numeroOculto && oportunidades >0){
                System.out.printf("El número que estoy pensando es menor que %d%n", numero);
                System.out.printf("Te quedan %d oportunidades%n", oportunidades);
            }
            if(numero < numeroOculto && oportunidades >0){
                System.out.printf("El número que estoy pensando es mayor que %d%n", numero);
                System.out.printf("Te quedan %d oportunidades%n", oportunidades);
            }
            if(numero==numeroOculto){
                acertado = true;
                System.out.println("Enhorabuena, has acertado");
            }

        } while (!acertado && oportunidades > 0);

        if(!acertado){
            System.out.printf("Lo siento, no has acertado, el número oculto es: %d ", numeroOculto);
        }
    }
}
