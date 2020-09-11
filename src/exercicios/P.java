
package exercicios;

import javax.swing.JOptionPane;

/*
        Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é
definido como segue:
• 20% do salário para os funcionários homens com mais de quinze anos de casa;
• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
Elabore um programa que recebe o sexo, o tempo de casa e o salário de um funcionário e
exibe o valor total que o funcionário receberá no Natal (salário + bônus).

 
 */
public class P {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        int tempoDeCasa = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de casa:"));
        char sexo = JOptionPane.showInputDialog("Informe o sexo: ").charAt(0);
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        
        if(tempoDeCasa > 15 && sexo == 'H'){
            double bonus = 0.20;
            double salarioNatal = (salario * bonus) + salario;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }else if(tempoDeCasa > 10 && sexo == 'M') {
            double bonus = 0.25;
            double salarioNatal = (salario * bonus) + salario;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }else {
            double salarioNatal = salario + 200;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }
    }
}
