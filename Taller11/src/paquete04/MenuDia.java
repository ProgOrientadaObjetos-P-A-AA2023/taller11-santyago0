package paquete04;

import paquete03.Menu;

/**
 *
 * @author santy
 */
public class MenuDia extends Menu {
    
    private double valorPostre;
    private double valorBebida;
    
    public MenuDia(String n, double vI, double vP, double vB) {
        super(n, vI);
        valorPostre = vP;
        valorBebida = vB;
    }
    
    public void establecerValorPostre(double v) {
        valorPostre = v;
    }
    
    public void establecerValorBebida(double v) {
        valorBebida = v;
    }
    
    // Sobre escritura del método abstracto de la superclase
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }
    
    public double obtenerValorPostre() {
        return valorPostre;
    }
    
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú del Día:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tValor Bebida: $%.2f\n"
                + "\tValor Postre: $%.2f\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicial,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
    
}
