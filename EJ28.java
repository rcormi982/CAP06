/*Realiza una versión del programa "Hola Mundo". Se debe mostrar la palabra HOLA (todo en mayúsculas)
 hecha con asteriscos. La altura de la palabra debe de ser un número impar generado al azar entre el 3 y el 13
 ambos incluidos. Los palos horizontales de la H y de la A está justo a la mitad de la altura. La anchura de las
 letras siempre es la misma. Aunque en este caso, sólo hay 6 posibles HOLAs de distinta altura. El programa debe
 de tal forma que sea muy fácil adaptarlo a otros rangos de altura, por ejemplo entre 7 y 33. Por tanto no se da 
 por válido escribir 6 sentencias if, cada una pintando la correspondiente figura completa. */

public class EJ28 {
    public static void main(String[] args) {

        int altura =(int) (Math.random()*((13 - 3 + 1) / 2)) * 2 + 3;
        //int randomNum = (int) (Math.random() * ((max - min + 1) / 2)) * 2 + min;

        for (int i = 1; i <= altura; i++) {
            if(i==1){
                System.out.println("*    *  ***   *       ****");
            }else if(i==altura/2+1){
                System.out.println("****** *    * *      ******");
            }else if(i==altura){
                System.out.println("*    *  ***   ****** *    *");
            }else{
                System.out.println("*    * *    * *      *    *");
            }
        }
        System.out.print("Altura: " + altura);
    }
}
