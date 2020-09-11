/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
  Desenvolva um programa que, com base em duas notas de provas e três notas de
trabalhos dadas pelo usuário,
exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
• 6 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 ≤ 10, 𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• 4 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 6, 𝑒𝑥𝑎𝑚𝑒
• 0 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 4, 𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• Considere que 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 =
𝑃𝑟𝑜𝑣𝑎𝑠+𝑇𝑟𝑎𝑏𝑎𝑙ℎ𝑜𝑠

 */
public class O {
    public static void main(String[] args) {
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da primeira prova:"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da segunda prova:"));
        
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do primeiro trabalho:"));
        float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do segundo trabalho:"));
        float nota5 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do terceiro trabalho:"));
        
        float media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        
        if(media >= 6 && media <= 10){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }else if(media >= 4 && media < 6){
            JOptionPane.showMessageDialog(null, "Exame");
        }else if(media >= 0 && media < 4){
             JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
