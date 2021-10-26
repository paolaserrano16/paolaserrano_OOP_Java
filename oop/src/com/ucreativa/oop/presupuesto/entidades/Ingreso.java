package com.ucreativa.oop.presupuesto.entidades;

public class Ingreso extends Movimiento{

    private String periodicidad;

    public Ingreso(String nombre,
                   String moneda,
                   String categoria, int monto,
                   String periodicidad){
        super(nombre, moneda, monto);
        this.periodicidad = periodicidad;
    }

    @Override
    public String getNombre(){
        return super.getNombre() + " " + this.periodicidad;
    }
}