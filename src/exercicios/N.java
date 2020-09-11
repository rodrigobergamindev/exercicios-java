
package exercicios;

import javax.swing.JOptionPane;

/**
 Faça um programa que recebe a idade de um nadador e exibe a categoria que ele
pertence. Sendo o critério:
• Infantil (0 a 10 anos);
• Junior (11 a 14 anos);
• Adolescente (15 a 20 anos);
• Jovem (21 a 35 anos) e
• Máster (> 35 anos).
*/
public class N {
        
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade do nadador:"));
    
    if(idade > 0 && idade <= 10){
        JOptionPane.showMessageDialog(null, "Infatil");
    }else if(idade >= 11 && idade <= 14){
        JOptionPane.showMessageDialog(null, "Junior");
    }else if(idade >= 15 && idade <= 20){
        JOptionPane.showMessageDialog(null, "Adolescente");
    }else if(idade >= 21 && idade <= 35){
         JOptionPane.showMessageDialog(null, "Jovem");
    }else {
        JOptionPane.showMessageDialog(null, "Master");
    }
        
    }
  
}
