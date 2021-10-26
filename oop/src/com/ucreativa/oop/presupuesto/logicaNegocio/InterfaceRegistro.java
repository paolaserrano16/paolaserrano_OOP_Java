package com.ucreativa.oop.presupuesto.logicaNegocio;


public interface InterfaceRegistro {

    void getMovimientos();

    void addIngreso(String nombre, String moneda, String categoria, int montoStr, String periodicidad);

    void addGasto(String nombre, String moneda, String categoria, String montoStr);

    void getGastos();

}