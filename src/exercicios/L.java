
package exercicios;

import javax.swing.JOptionPane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
    Faça um programa que recebe o nome e a data de nascimento de duas pessoas e
    exibe o nome da mais velha. Cada data deve ser fornecida em três valores inteiros, onde
    o primeiro representa o dia, o segundo o mês e o terceiro o ano.

*/

public class L {
    
    public static void main(String[] args) throws ParseException {
        
        String name1 = JOptionPane.showInputDialog("Informe o nome da primeira pessoa:");
        String a = JOptionPane.showInputDialog(null, "Informe a data de nascimento:");
        
        String name2 = JOptionPane.showInputDialog("Informe o nome da segunda pessoa:");
        String b = JOptionPane.showInputDialog(null, "Informe a data de nascimento:");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //Definindo o formato de declaração de novos objetos de data. Use o mesmo formato ao declarar novas datas
           Date date1 = sdf.parse(a); //data1 é 23 de fevereiro de 1995
           Date date2 = sdf.parse(b); //data2 é 31 de outubro de 2001
        
           
           if(date1.compareTo(date2) < 0){
               JOptionPane.showMessageDialog(null, name1 + " é a mais velho(a)");
           }else if(date1.compareTo(date2) > 0) {
               JOptionPane.showMessageDialog(null, name2 + " é a mais velho(a)");
           }else {
               JOptionPane.showMessageDialog(null, name1 + " e " + name2 + " possuem a mesma idade");
           }
    }
    
    
}
