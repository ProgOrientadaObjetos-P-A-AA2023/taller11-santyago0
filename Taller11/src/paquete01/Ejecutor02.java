/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Cuenta;
import paquete03.Menu;
import paquete04.*;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
        };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        // Creación de los objetos de tipo MenuNinio
        for(int i = 0; i < datos001.length; i++) {
            for(int j = 0; j < 1; j++) {
                String nombre = datos001[i][j];
                double valorInicial = Double.parseDouble(datos001[i][j+1]);
                double valorHelado = Double.parseDouble(datos001[i][j+2]);
                double valorPastel = Double.parseDouble(datos001[i][j+3]);
                MenuNinios mN = new MenuNinios(nombre,valorInicial,
                        valorHelado,valorPastel);
                
                lista.add(mN);
            }
        }
        
        // Creación de los objetos de tipo MenuEconomico
        for(int i = 0; i < datos002.length; i++) {
            for(int j = 0; j < 1; j++) {
                String nombre = datos002[i][j];
                double valorInicial = Double.parseDouble(datos002[i][j+1]);
                double descuento = Double.parseDouble(datos002[i][j+2]);
                MenuEconomico mE = new MenuEconomico(nombre,valorInicial,
                        descuento);
                
                lista.add(mE);
            }
        }
        
        // Creación de los objetos de tipo MenuDia
        for(int i = 0; i < datos003.length; i++) {
            for(int j = 0; j < 1; j++) {
                String nombre = datos003[i][j];
                double valorInicial = Double.parseDouble(datos003[i][j+1]);
                double valorPostre = Double.parseDouble(datos003[i][j+2]);
                double valorBebida = Double.parseDouble(datos003[i][j+3]);
                MenuDia mD = new MenuDia(nombre,valorInicial,
                        valorPostre,valorBebida);
                
                lista.add(mD);
            }
        }
        
        // Creación de los objetos de tipo MenuCarta
        for(int i = 0; i < datos004.length; i++) {
            for(int j = 0; j < 1; j++) {
                String nombre = datos004[i][j];
                double valorInicial = Double.parseDouble(datos004[i][j+1]);
                double valorGuarnicion = Double.parseDouble(datos004[i][j+2]);
                double valorBebida = Double.parseDouble(datos004[i][j+3]);
                double porcentajeAd = Double.parseDouble(datos004[i][j+4]);
                MenuCarta mC = new MenuCarta(nombre,valorInicial,
                        valorGuarnicion,valorBebida,porcentajeAd);
                
                lista.add(mC);
            }
        }
        
        // Fin de solución
        
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularValorMenu();
        }
        
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.calcularSubtotal();
        miCuenta.calcularValorTotal();
        System.out.printf("%s\n", miCuenta);
        


    }
}
