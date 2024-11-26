/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34Rodriguezed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Rodriguez
 */
public class Sesion34RodriguezED_Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de pila
        Stack<Integer> PilaRodriguez = new Stack<>();
        PilaRodriguez.push(100);
        PilaRodriguez.push(150);
        PilaRodriguez.push(230);
        PilaRodriguez.push(10);
        PilaRodriguez.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n" + PilaRodriguez);
        
        JOptionPane.showMessageDialog(null, "Autor Sergio Rodriguez \n");
        
    }
}
