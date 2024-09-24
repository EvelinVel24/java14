package modelo;

import interfaces.ProductoInterface;

public class Refrigerador extends Producto implements ProductoInterface {
    private char tipoGastoElectrico; 
    private int numPuertas;

    public Refrigerador(double precio, int cantidadDisponible, char tipoGastoElectrico, int numPuertas) {
        super(precio, cantidadDisponible);
        this.tipoGastoElectrico = tipoGastoElectrico;
        this.numPuertas = numPuertas;
    }

    @Override
    public void cambiarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    @Override
    public int cantidadDisponible() {
        return this.cantidadDisponible;
    }

    public char getTipoGastoElectrico() {
        return tipoGastoElectrico;
    }

    public void setTipoGastoElectrico(char tipoGastoElectrico) {
        this.tipoGastoElectrico = tipoGastoElectrico;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}

