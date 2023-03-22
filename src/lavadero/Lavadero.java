/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadero;

/**
 *
 * @author cymaniatico
 */
public class Lavadero {

    String nombre;
    String placa;
    String tipoLavado;
    int precioPagado;

    public Lavadero(String nombre, String placa, String tipoLavado, int precioPagado) {
        this.nombre = nombre;
        this.placa = placa;
        this.tipoLavado = tipoLavado;
        this.precioPagado = precioPagado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoLavado() {
        return tipoLavado;
    }

    public int getPrecioPagado() {
        return precioPagado;
    }
    
    
    
}
