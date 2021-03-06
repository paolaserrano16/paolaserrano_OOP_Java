package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

public class ImplementacionRegistroEnArchivo implements InterfaceRegistro {

    private InterfaceRepository repository;

    public ImplementacionRegistroEnArchivo(InterfaceRepository repository){

        this.repository = repository;
    }


    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, int monto, String montoStr, String periodicidad) throws ErrorMuyPocaData {
       // int monto = Integer.parseInt(montoStr);
        Ingreso ingreso = new Ingreso(nombre,
                moneda,
                categoria,
                monto,
                periodicidad);
        return this.repository.save(ingreso.getDetails());
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData {
        int monto = Integer.parseInt(montoStr);
        Movimiento gasto = new Gasto(nombre,
                moneda,
                categoria,
                monto) {
           /* @Override
            protected String getMoneda() {
                return null;
            }

            @Override
            protected String getCategoria() {
                return null;
            }

            @Override
            protected String getMonto() {
                return null;
            }*/
        };
        return this.repository.save(gasto.getDetails());
    }

    @Override
    public void getMovimientos() {
        this.repository.read();
    }

    @Override
    public void getGastos() {
        this.repository.read();
    }

    @Override
    public boolean addIngreso(String text, String text1, String text2, String text3, String text4) {

        return false;
    }
}