
package exercicios;

import javax.swing.JOptionPane;

/**
  Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo de competição e exibe a categoria
    a qual ele pertence, sendo:
        • De 0cc a 120cc: “Sub Production”;
        • De 121cc a 240cc: “Production”;
        • Acima de 240cc: “Super Production”
 */
public class M {
    
    public static void main(String[] args) {
        
        int cc = Integer.parseInt(JOptionPane.showInputDialog("Informe as cilindradas do veículo"));
        
        if(cc >= 0 && cc <= 120) {
            JOptionPane.showMessageDialog(null, "Sub Production");
        }else if(cc >= 121 && cc <= 240){
            JOptionPane.showMessageDialog(null, "Production");
        }else if(cc >= 240){
            JOptionPane.showMessageDialog(null, "Super Production");
        }
    
    }
}
