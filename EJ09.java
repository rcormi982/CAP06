public class EJ09 {
/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/
    public static void main(String[] args) {
        System.out.println("Números pares aleatorios.");
        int numero = 0;
        int contador = 0;

        while (numero!=24) {
            numero = (int)(Math.random()*51)*2;
            System.out.print(numero + " ");
            contador++;
        }
        System.out.println();
        System.out.printf("Se han generado %d números.", contador);
    }
}
