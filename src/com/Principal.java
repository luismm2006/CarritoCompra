package com;

import com.model.Cesta;
import com.model.Cliente;
import com.model.Producto;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("usuario123", "password", "Juan Pérez");
        Producto producto1 = new Producto("P001", "Laptop", 10, 899.99f);
        Producto producto2 = new Producto("P002", "Smartphone", 5, 499.99f);
        Cesta cesta = new Cesta();
        cesta.agregarArticulo(producto2, 5);
        cliente.hacerPedido();
        System.out.println(cliente);
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(cesta);

        cesta.borrarCesta();
        System.out.println(cliente);
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(cesta);

	}
}
