package com.model;

import java.util.ArrayList;

public class Cliente {
	private String username;
    private String contrasena;
    private String nombre;
    private String email;
    private ArrayList<Pedido> pedidos;

    public Cliente(String username, String contrasena, String nombre) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.email = "";
        this.pedidos = new ArrayList<>();
    }

    public void hacerPedido() {
        Pedido nuevoPedido = new Pedido();
        pedidos.add(nuevoPedido);
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre;
    }
}
