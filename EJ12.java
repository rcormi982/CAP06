/*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
entero en un carácter. */
public class EJ12 {
    public static void main(String[] args) {
        int ancho = 130;
        int alto = 40;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
        // Genera un carácter aleatorio entre el 32 y el 126
                int caracter = (int) (Math.random() * 95) + 32;

        // Imprime el carácter en la pantalla
                System.out.print((char) caracter);
      }
      System.out.println();
    }
  }
}
