package com.ucreativa.oop.presupuesto.logicaNegocio;


public interface InterfaceRegistro {



    boolean addIngreso(String s, String nombre, String moneda, String categoria, String periodicidad);

    boolean addGasto(String nombre, String moneda, String categoria, String montoStr);


    void getMovimientos();

    void getGastos();
}