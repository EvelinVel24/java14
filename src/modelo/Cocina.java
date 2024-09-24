package modelo;

import interfaces.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface { // Usamos "implements" para la interfaz
    private int cantidadQuemadores;
    private boolean incluyeGas;

    public Cocina(double precio, int cantidadDisponible, int cantidadQuemadores, boolean incluyeGas) {
        super(precio, cantidadDisponible);
        this.cantidadQuemadores = cantidadQuemadores;
        this.incluyeGas = incluyeGas;
    }

    public int getCantidadQuemadores() {
        return cantidadQuemadores;
    }

    public void setCantidadQuemadores(int cantidadQuemadores) {
        this.cantidadQuemadores = cantidadQuemadores;
    }

    @Override
    public void cambiarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    @Override
    public int cantidadDisponible() {
        return this.cantidadDisponible;
    }

    @Override
    public boolean incluyeGas() {
        return this.incluyeGas;
    }
}

