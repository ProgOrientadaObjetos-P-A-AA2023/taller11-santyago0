package paquete02;

import java.util.ArrayList;
import paquete03.Menu;
import paquete04.*;

/**
 *
 * @author santy
 */
public class Cuenta {
    
    private String nombreClinete;
    private ArrayList<Menu> listaMenu;
    private double subtotal;
    private double iva;
    private double valorTotal;
    
    public Cuenta(String n, ArrayList<Menu> l, double i) {
        nombreClinete = n;
        listaMenu = l;
        iva = i;
    }
    
    public void establecerNombreClinete(String n) {
        nombreClinete = n;
    }
    
    public void establecerListaMenu(ArrayList<Menu> l) {
        listaMenu = l;
    }
    
    public void calcularSubtotal() {
        double suma = 0;
        
        for(int i = 0; i < listaMenu.size(); i++) {
            suma = suma + listaMenu.get(i).obtenerValorMenu();
        }
        
        subtotal = suma;
    }
    
    public void establecerIva(double i) {
        iva = i;
    }
    
    public void calcularValorTotal() {
        valorTotal = subtotal + (subtotal * (iva/100));
    }
    
    public String obtenerNombreClinete() {
        return nombreClinete;
    }
    
    public ArrayList<Menu> obtenerListaMenu() {
        return listaMenu;
    }
    
    public double obtenerSubTotal() {
        return subtotal;
    }
    
    public double obtenerIva() {
        return iva;
    }
    
    public double obtenerValorTotal() {
        return valorTotal;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("FACTURA:\n"
                + "Cliente: %s\n",nombreClinete);
        
        for(int i = 0; i < listaMenu.size(); i++) {
           cadena = String.format("%s%s",cadena,
                   listaMenu.get(i)); 
        }
        
        cadena = String.format("%s\nSubtotal: $%.2f\n"
                + "IVA: %.2f%%\n"
                + "Total a Pagar: $%.2f",
                cadena,
                subtotal,
                iva,
                valorTotal);
        
        return cadena;
    }
    
}
