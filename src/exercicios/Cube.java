/*
 Classe auxiliar para o cálculo realizado no exercício Q
 */
package exercicios;

public class Cube{
    String name;
    double base;
    double altura;
    double comprimento;
    double area = this.base * this.comprimento * this.altura;
    
    public Cube(double base, double altura, double comprimento, String name) {
        this.name = name;
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    
}
