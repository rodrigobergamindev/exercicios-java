
package exercicios;
import exercicios.Triangle;
import javax.swing.JOptionPane;


public class I {
    
    /* Faça um programa que recebe o valor de três arestas e exibe uma mensagem
    indicando se podem formar um triângulo. Em caso afirmativo, indique se ele é equilátero,
    isósceles ou escaleno. Lembre-se: Para que um triângulo exista, a medida de qualquer
    um dos lados deve ser menor que a soma das medidas dos outros dois.
    */
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado C: "));
            
        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle.isTriangle());
        System.out.println(triangle.typeTriangle());
    }
    
}
