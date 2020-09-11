
package exercicios;

import javax.swing.JOptionPane;

/*
     Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se
    ele é par ou ímpar (use o operador % para obter o resto de uma divisão inteira).

*/
public class E {
    public static void main(String[] args) {
         int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
         
         if(n%2 == 0) {
             JOptionPane.showMessageDialog(null, "O número é par");
         }else {
             JOptionPane.showMessageDialog(null, "O número é ímpar");
         }
    }
}
