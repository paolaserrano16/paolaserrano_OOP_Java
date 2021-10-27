package com.ucreativa.oop.presupuesto.entidades;
import java.util.Date;



public abstract class Movimiento {
    public String nombre;
    public String moneda;
    public String categoria;
    public int monto;
    public Date fecha;

    public Movimiento(String nombre,
                      String moneda,
                      int monto){
        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();
    }

    public String getNombre(){

        return this.nombre;
    }



    protected void imprimaHola(){
        System.out.println("Hola");

    }

    public abstract String getDetails();

    protected abstract String getMoneda();

    protected abstract String getCategoria();

    protected abstract String getMonto();
}

