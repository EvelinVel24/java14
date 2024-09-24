package modelo;

public class Producto {
    protected double precio;
    protected int cantidadDisponible;

    public Producto(double precio, int cantidadDisponible) {
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
