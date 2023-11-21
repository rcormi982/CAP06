/*Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la || */
public class EJ15 {
    public static void main(String[] args) {
        int notas = 4 * (int) (Math.random() * 7 + 1); // Se multiplica por 4 para que sea 28
        String nota = "";
        String primeraNota = "";
        
        for (int contadorNota = 1; contadorNota <= notas; contadorNota++) {
            switch ((int) (Math.random() * 7) + 1) {
                case 1:
                    nota = "do";
                    break;
                case 2:
                    nota = "re";
                    break;
                case 3:
                    nota = "mi";
                    break;
                case 4:
                    nota = "fa";
                    break;
                case 5:
                    nota = "sol";
                    break;
                case 6:
                    nota = "la";
                    break;
                case 7:
                    nota = "si";
                    break;
                default:
                    break;
            }
            
            if (contadorNota == 1) {
                primeraNota = nota;
            }
            
            if (contadorNota == notas) {
                nota = primeraNota;
            }
            
            System.out.print(nota + " ");
            
            if (contadorNota == notas) {
                System.out.print("||");
            } else if (contadorNota % 4 == 0) {
                System.out.print("| ");
            }
        }
    }
}

