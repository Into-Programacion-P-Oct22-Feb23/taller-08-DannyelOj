/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica03;

/**
 *
 * @author VEL-USER
 */
public class Problematica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double f = 20;
        double c = 0;
        int contador;
        String cadena = "";
        cadena = cadena + "F°\tC°\n";

        for (contador = 1; contador <= 20; contador ++) {
            c = (f - 32) * 5/9;
            cadena = String.format("%s%.2f\t%.2f\n", 
                    cadena,
                    f, 
                    c);
            
            f += 4;
        }
        System.out.println(cadena);
    }
    
}
