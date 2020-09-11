
package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;


public class H {
    
    /*
         Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a
        maior área. Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2
    */
    
    
    public static void main(String[] args) {
        List<Double> areas = new ArrayList<>();
        
        
        for (int i = 0; i <= 2; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do triângulo"));
            double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do triângulo"));
            double area = (base * altura) / 2;
            areas.add(area);
        }
        double highest = Collections.max(areas);
        String result = String.format("%.2f", highest);
        System.out.println(areas);
        JOptionPane.showMessageDialog(null, "A maior área é: " + result);
    }
}
