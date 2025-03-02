package com.model;

import java.util.ArrayList;

public class Cesta {
	private ArrayList<LineaCesta> detallesCesta;

    public Cesta() {
        detallesCesta = new ArrayList<>();
    }

    public void agregarArticulo(Producto articulo, int cantidad) {
        detallesCesta.add(new LineaCesta(articulo, cantidad));
    }

    public void borrarCesta() {
        detallesCesta.clear();
    }

    @Override
    public String toString() {
        return "Cesta con " + detallesCesta.size() + " artículos.";
    }
}
