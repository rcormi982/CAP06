/*Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6. */
public class EJ08 {
    public static void main(String[] args) {
        System.out.println("Programa de quiniela deportiva\n");
        int resultado;
        int columna = 3;
        for (int i = 1; i<=15; i++) {
            System.out.printf("%2d.  |", i );
        
            if(i==15){
                columna = 1;
            }

            for (int j = 1; j <= columna; j++) {
                resultado =(int)(Math.random()*6 + 1);   
                switch (resultado) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print("1  |");
                        break;
                    case 4:
                    case 5:
                        System.out.print(" X |");
                        break;
                    case 6:
                        System.out.print("  2|");
                        break;
                    default:
                        break;
                }             
            }
            System.out.println();
        }
    }
}
