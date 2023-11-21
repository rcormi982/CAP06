/*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.*/
public class EJ14 {
    public static void main(String[] args) {
        System.out.println("Número secreto");
        System.out.print("Piensa un número: ");
        int numeroOculto = Integer.parseInt(System.console().readLine());
        int oportunidades = 5;
        boolean acertado = false;
        do {
            int numeroIntroducido = (int)(Math.random()*100+1);
            System.out.println("El número que he pensado es: " + numeroIntroducido);
            oportunidades--;

            if(numeroIntroducido>numeroOculto){
                System.out.println("El número que has introducido es mayor que el oculto, inténtelo de nuevo");
                System.out.printf("Te quedan %d oportunidades%n", oportunidades );
            }
            if(numeroIntroducido<numeroOculto){
                System.out.println("El número que has introducido es menor que el oculto, inténtelo de nuevo");
                System.out.printf("Te quedan %d oportunidades%n", oportunidades );
            }
            if(numeroIntroducido==numeroOculto){
                acertado = true;
                System.out.println("Enhorabuena, has acertado");
                System.out.println("El número secreto es: "+ numeroOculto);
            }
        }while(!acertado && oportunidades >0);

        if(oportunidades<=0){
                System.out.println("Lo siento has agotado todas las oportunidades");
                System.out.println("El número secreto es: "+ numeroOculto);
        }
    }
}
