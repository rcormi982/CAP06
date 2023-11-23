/*Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara */
public class EJ21 {
    public static void main(String[] args) {
        System.out.println("Programa de monedas cara o cruz");
        String moneda = "";
        String posicion = "";
        for (int i = 1; i <=5; i++) {
            switch ((int)(Math.random()*8 + 1)) {
                case 1:
                    moneda = "1 céntimo";
                    break;
                case 2:
                    moneda = "2 céntimos";
                    break;
                case 3:
                    moneda = "5 céntimos";
                    break;
                case 4:
                    moneda = "10 céntimos";
                    break;
                case 5:
                    moneda = "20 céntimos";
                    break;
                case 6:
                    moneda = "50 céntimos";
                    break;
                case 7:
                    moneda = "1 euro";
                    break;
                case 8:
                    moneda = "2 euros";
                    break;
                default:
                    break;
            }
            switch ((int)(Math.random()*2+1)) {
                case 1:
                    posicion = "cara";
                    break;
                case 2:
                    posicion = "cruz";
                    break;
                default:
                    break;
            }  
            System.out.printf("%s - %s%n", moneda, posicion);
        }
    }
}
