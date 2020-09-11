
package exercicios;
import exercicios.Cube;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;

/*

     Elabore um programa que lê as medidas de três cubos retangulares (base, altura e
largura) e exibe a ordem que eles devem ser colocados em um caminhão, obedecendo ao
critério de que cubos com maior área devem ser colocados primeiro. Observe o exemplo
a seguir:
• Cubo 1 – Base: 2 / Altura: 4 / Comprimento: 5;
• Cubo 2 – Base: 4 / Altura: 4 / Comprimento: 4;
• Cubo 3 – Base: 2 / Altura: 1 / Comprimento: 2.
Ordem da colocação: cubo 2, cubo 1 e cubo 3.
 
 */
public class Q {
    public static void main(String[] args) {
        
        List<Cube> cubes = new ArrayList<>();
        
        
        for (int i = 0; i <= 2; i++) {
            
            String name = JOptionPane.showInputDialog("Nome do cubo");
            double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do cubo: "));
            double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do cubo: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do cubo: "));
            Cube cube = new Cube(base, altura, comprimento, name);

            cubes.add(cube);
            
        }

        /*INCOMPLETO*/
    }
}
