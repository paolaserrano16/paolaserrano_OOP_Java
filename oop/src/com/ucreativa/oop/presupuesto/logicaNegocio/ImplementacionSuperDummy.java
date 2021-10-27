package com.ucreativa.oop.presupuesto.logicaNegocio;

public class ImplementacionSuperDummy implements InterfaceRegistro, InterfaceReportes     {


    @Override
    public void getMovimientos() {

        System.out.println("No haga nada");

    }

    @Override
    public void addIngreso(String s, String nombre, String moneda, String categoria, String periodicidad) {
        System.out.println("No haga nada");
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String montoStr) {
        System.out.println("No haga nada");
    }

    @Override
    public void getGastos() {
        System.out.println("No haga nada");
    }
}
