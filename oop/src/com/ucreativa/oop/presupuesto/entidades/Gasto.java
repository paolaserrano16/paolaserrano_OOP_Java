package com.ucreativa.oop.presupuesto.entidades;


public class Gasto extends Movimiento{

    public Gasto(String nombre,
                 String moneda,
                 String categoria,
                 int monto) {
        super(nombre, nombre, moneda, monto);


    }

    public Gasto(String nombre, String s1, int monto) {
        super(nombre, nombre, s1, monto);
    }

    @Override
    public String getDetails() {
        return "GASTO: " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto();
    }
}

