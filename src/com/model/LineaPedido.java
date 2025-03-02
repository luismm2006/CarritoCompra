package com.model;

public class LineaPedido {
	private Producto articulo;
    private int cantidad;

    public LineaPedido(Producto articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return articulo + " x" + cantidad;
    }
}
