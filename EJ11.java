/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de\
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el númer\
o de suspensos, el número de suficientes, el número de bienes, etc.*/
public class EJ11 {
    public static void main(String[] args) {
        System.out.println("Notas al azar");
        String calificacion = "";
        int nota; 
        int suspensos=0;
        int suficientes=0;
        int bienes=0;
        int notables=0;
        int sobresalientes=0;
        for (int i = 1; i <= 20; i++) {
            nota = (int)(Math.random()*11);
            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    calificacion = "Suspenso";
                    suspensos++;
                    break;
                case 5:
                    calificacion = "Suficiente";
                    suficientes++;
                    break;
                case 6:
                    calificacion = "Bien";
                    bienes++; 
                    break;
                case 7:
                case 8:
                    calificacion = "Notable";
                    notables++; 
                    break;
                case 9:
                case 10:
                    calificacion = "Sobresaliente";
                    sobresalientes++;
                    break;
                default:
                    calificacion = "No calificado";
                    break;
            }
            System.out.printf("La nota %d es equivalente a un %s%n", nota, calificacion);
        }
        System.out.println("El número de suspensos es: " + suspensos);
        System.out.println("El número de suficientes es: " + suficientes);
        System.out.println("El número de bienes es: " + bienes);
        System.out.println("El número de notables es: " + notables);
        System.out.println("El número de sobresalientes es: " + sobresalientes);
    }
}
