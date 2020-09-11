
package exercicios;

import javax.swing.JOptionPane;

public class C {
    
    /*
        Faça um programa que recebe dois números inteiros distintos e exibe o maior.
    */

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        
        if(n1 > n2) { 
            JOptionPane.showMessageDialog(null, "O maior número é: " + n1);
        }else{
            JOptionPane.showMessageDialog(null, "O maior número é: " + n2);
        }
    }
    
}
