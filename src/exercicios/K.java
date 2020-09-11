
package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
    Faça um programa que recebe duas datas distintas e exibe a mais recente. Cada data
    deve ser fornecida como três valores inteiros, onde o primeiro representa o dia, o segundo
    o mês e o terceiro o ano. Dica: comece verificando pelo ano.
 */
public class K {
    public static void main(String[] args) throws ParseException {
        
        JOptionPane.showMessageDialog(null, "As datas devem ser informadas no formato: dd-MM-yyyy");
        String a = JOptionPane.showInputDialog(null, "Informe a primeira data");
        String b = JOptionPane.showInputDialog(null, "Informe a seguna data");
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //Definindo o formato de declaração de novos objetos de data. Use o mesmo formato ao declarar novas datas
           Date date1 = sdf.parse(a); //data1 é 23 de fevereiro de 1995
           Date date2 = sdf.parse(b); //data2 é 31 de outubro de 2001
           
           if(date1.compareTo(date2) < 0){
               JOptionPane.showMessageDialog(null, date1);
           }else if(date1.compareTo(date2) > 0) {
               JOptionPane.showMessageDialog(null, date2);
           }else {
               JOptionPane.showMessageDialog(null, "As datas são iguais");
           }
            
       
    }
}
