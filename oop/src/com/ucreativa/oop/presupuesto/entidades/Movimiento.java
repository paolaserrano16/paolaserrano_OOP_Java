package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;

public class Movimiento {

    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

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

    }
