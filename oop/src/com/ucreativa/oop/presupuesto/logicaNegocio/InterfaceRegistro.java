package com.ucreativa.oop.presupuesto.logicaNegocio;


public interface InterfaceRegistro {



    void addIngreso(String s, String nombre, String moneda, String categoria, String periodicidad);

    void addGasto(String nombre, String moneda, String categoria, String montoStr);


    void getMovimientos();

    void getGastos();
}