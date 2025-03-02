package com.model;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<LineaPedido> detallesPedidos;

    public Pedido() {
        detallesPedidos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Pedido con " + detallesPedidos.size() + " productos.";
    }
}
