/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas */
public class EJ16 {
    public static void main(String[] args) {
        int figura;
        int figura1=0;
        int figura2=0;
        int figura3=0;
        
        for (int i = 1; i <=3; i++) {
            figura = (int)(Math.random()*5+1);
        switch (figura) {
            case 1:
                System.out.print("corazón ");
                break;
            case 2:
                System.out.print("diamante ");
                break;
            case 3:
                System.out.print("herradura ");
                break;
            case 4:
                System.out.print("campana ");
                break;
            case 5:
                System.out.print("limón ");
                break;
            default:
                break;
        }
        switch (i) {
            case 1:
                figura1= figura; 
                break;
            case 2:
                figura2= figura; 
                break;
            case 3:
                figura3= figura; 
                break;
            default:
                break;
        }
    }
    System.out.println();
    if(figura1!=figura2 && figura1!=figura3 && figura2!=figura3){
        System.out.println("Lo siento ha perdido");
    }else if(figura1==figura2 && figura1==figura3){
        System.out.println("Enhorabuena, ha ganado diez monedas");
    }else{
        System.out.println("Bien, ha recuperado su moneda");
    }
}
}
