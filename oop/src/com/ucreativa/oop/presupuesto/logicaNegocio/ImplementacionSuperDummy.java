package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;

public class ImplementacionSuperDummy implements InterfaceRegistro, InterfaceReportes {

    @Override
   // public void getMovimientos() {

    //}
        public void getMovimientos() {
            System.out.println("No haga nada");

        }

        @Override
        public boolean addIngreso(String nombre, String moneda, String categoria, String monto, String periodicidad) {
            System.out.println("No haga nada");
            return true;
        }

    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, int monto, String montoStr, String periodicidad) throws ErrorMuyPocaData {
        return false;
    }

    @Override
        public boolean addGasto(String nombre, String moneda, String categoria, String monto) {
            System.out.println("No haga nada");
            return true;
        }
        @Override
        public void getGastos() {
            System.out.println("No haga nada");
        }

        @Override
        public void imprimirReporte() {
            System.out.println("No haga nada");
        }
    }