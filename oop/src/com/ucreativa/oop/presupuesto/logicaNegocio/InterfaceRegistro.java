package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;

public interface InterfaceRegistro {

    //boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);
    boolean addIngreso(String nombre, String moneda, String categoria, int monto, String montoStr, String periodicidad) throws ErrorMuyPocaData;

   // boolean addGasto(String nombre, String moneda, String categoria, String montoStr);
    boolean addGasto(String nombre , String moneda, String categoria, String montoStr) throws ErrorMuyPocaData;

    void getMovimientos();

    void getGastos();

    void addIngreso(String text, String text1, String text2, String text3, String text4);
}