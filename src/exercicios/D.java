/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/*
    Faça um programa que recebe dois números reais e exibe o menor deles e com duas
    casas decimais.
*/

public class D {
    
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        
        if(n1 > n2) { 
            String result = String.format("%.2f", n1);
            JOptionPane.showMessageDialog(null, "O maior número é: " + result);
        }else{
            String result = String.format("%.2f", n2);
            JOptionPane.showMessageDialog(null, "O maior número é: " + result);
        }
    }
    
}
