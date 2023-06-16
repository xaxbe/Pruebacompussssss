package pruebacompuesta;
import java.util.Scanner;

/**
 *
 * @author xaxbe
 *
 * Considerando un rango entre 1 y 10 para asignar la nota de un curso, el
 * programa ilustra la selección múltiple con la sentencia switch.
 *
 */

public class Pruebacompuesta {
    public void compuesta(){
            int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca calificación (1 - 10), pulse Intro:");
        nota = entrada.nextInt();
        switch (nota) {
            case 10:
                System.out.println("Genial mamberroy.");
                break;
            case 9:
                System.out.println("Excelente.");
                break;
            case 8:
                System.out.println("Notable.");
                break;
            case 7:
                System.out.println("Eficiente.");
                break;
            case 6:
                System.out.println("deficiente.");
                break;
            case 5:
                System.out.println("Reprobado.");
                break;
            case 4:
                System.out.println("Escaso.");
                break;
            case 3:
                System.out.println("muy escaso.");
                break;
            case 2:
                System.out.println("Sigue esforzando.");
                break;
            case 1:
                System.out.println("sigue esforzandote.");
                break;
            case 0:
                System.out.println("no vengas mejor mano.");
                break;  
            default:
                System.out.println("no es posible esta nota.");
        }
        System.out.println("Final de programa.");
        }
    public static void main(String[] args) {
        Pruebacompuesta prueba = new Pruebacompuesta();
        prueba.compuesta();
    }
}
