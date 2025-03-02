package com.model;

public class Producto {
	private String codProducto;
    private String descripcion;
    private int cantidad;
    private float precio;

    public Producto(String codProducto, String descripcion, int cantidad, float precio) {
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void disminuirStock(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Producto: " + descripcion + " - " + precio + "€";
    }
}
