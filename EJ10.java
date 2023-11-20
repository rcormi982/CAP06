/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.*/
public class EJ10 {
    public static void main(String[] args) {
        System.out.println("Programa que pinta filas aleatorias de caracteres.");
        int relleno;
        String caracter = "";
        int longitud;
        for (int i = 1; i <=10; i++) {
            relleno = (int)(Math.random()*6 + 1);
            longitud = (int)(Math.random()*40 + 1);

            switch (relleno) {
                case 1:
                    caracter = "*";
                    break;
                case 2:
                    caracter = "-";
                    break;
                case 3:
                    caracter = "=";
                    break;
                case 4:
                    caracter = ".";
                    break;
                case 5:
                    caracter = "|";
                    break;
                case 6:
                    caracter = "@";
                    break;            
                default:
                    break;
            }
            for (int j = 1; j <=longitud; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
