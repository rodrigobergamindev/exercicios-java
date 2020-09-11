
package exercicios;

import javax.swing.JOptionPane;

/*
     Faça um programa que mostre um menu com as opções "adição", "subtração",
    "multiplicação" e "divisão",
    recebe dois valores reais, a operação escolhida pelo usuário e exibe o resultado da
    operação sobre os valores.

*/


public class G {
    
    public static void main(String[] args) {
        int operation = Integer.parseInt(JOptionPane.showInputDialog("1. Adição" + "\n" +
                "2. Subtração" + "\n" +
                "3. Divisão" + "\n" +
                "4. Multiplicação"));
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        
        if(operation == 1) {
            Double result = n1 + n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 2){
            Double result = n1 - n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 3){
            Double result = n1 / n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 4) {
            Double result = n1 * n2;
            JOptionPane.showMessageDialog(null, result);
        }else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    
}
