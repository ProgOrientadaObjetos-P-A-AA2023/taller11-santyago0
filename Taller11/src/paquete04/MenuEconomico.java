package paquete04;

import paquete03.Menu;

/**
 *
 * @author santy
 */
public class MenuEconomico extends Menu {
    
    private double porcentajeDescuento;
    
    public MenuEconomico(String n, double vI, double p) {
        super(n, vI);
        porcentajeDescuento = p;
    }
    
    public void establecerPorcentajeDescuento(double p) {
        porcentajeDescuento = p;
    }
    
    // Sobre escritura del método abstracto de la superclase
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial * (porcentajeDescuento/100));
    }
    
    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú Económico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tPorcentaje Descuento: %.2f%%\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicial,
                porcentajeDescuento,
                valorMenu);
        return cadena;
    }
    
}
