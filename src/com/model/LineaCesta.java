package com.model;

public class LineaCesta {
	private Producto producto;
    private int cantidad;

    public LineaCesta(Producto articulo, int cantidad) {
        this.producto = articulo;
        this.cantidad = cantidad;
    }

    public void aumentaCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void disminuyeCantidad(int cantidad) {
        if (this.cantidad > cantidad) {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return producto + " x" + cantidad;
    }
}
