package com.ucreativa.oop.presupuesto.logicaNegocio;

public class ImplementacionSuperDummy implements InterfaceRegistro, InterfaceReportes     {


    @Override
    public void getMovimientos() {

        System.out.println("No haga nada");

    }

    @Override
    public boolean addIngreso(String s, String nombre, String moneda, int monto, String categoria, String periodicidad) {
        System.out.println("No haga nada");
        return false;

    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {
        System.out.println("No haga nada");
        return false;
    }

    @Override
    public void getGastos() {
        System.out.println("No haga nada");
    }

    @Override
    public void addIngreso(String text, String text1, String text2, String text3, String text4) {

    }
}
