package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

public class ImplementacionRegistro implements InterfaceRegistro {

    private InterfaceRepository repository;
    private Object String;

    public ImplementacionRegistro(InterfaceRepository repository){
        this.repository = repository;
    }

    public ImplementacionRegistro() {

    }

    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, int monto, String montoStr, String periodicidad) throws ErrorMuyPocaData {
     {

            try {
                monto = Integer.parseInt(montoStr);
            }catch (NumberFormatException ex){
                System.out.println("Formato Invalido en ("+montoStr+") : " + ex.getMessage());
                return false;
            }

            Ingreso ingreso = new Ingreso(nombre,
                    moneda,
                    categoria,
                    monto,
                    periodicidad);
            return this.repository.save(ingreso.getDetails());
        }

    }

    @Override
    public boolean addGasto(java.lang.String nombre, java.lang.String moneda, java.lang.String categoria, java.lang.String montoStr) {
        return false;
    }

    @Override
    public void getMovimientos() {

    }

    @Override
    public void getGastos() {

    }

    @Override
    public void addIngreso(java.lang.String text, java.lang.String text1, java.lang.String text2, java.lang.String text3, java.lang.String text4) {

    }
}