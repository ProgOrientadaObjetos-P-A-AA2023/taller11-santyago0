package paquete03;

/**
 *
 * @author santy
 */
public abstract class Menu {
    
    protected String nombrePlato; 
    protected double valorInicial;
    protected double valorMenu;
    
    public Menu(String n, double vI) {
        nombrePlato = n;
        valorInicial = vI;
    }
    
    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }
    
    public void establecerValorInicial(double v) {
        valorInicial = v;
    }
    
    // Método abstracto de la Superclase
    public abstract void calcularValorMenu();
    
    public String obtenerNombrePlato() {
        return nombrePlato;
    }
    
    public double obtenerValorInicial() {
        return valorInicial;
    }
    
    public double obtenerValorMenu() {
        return valorMenu;
    }
    
}
