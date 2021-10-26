package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro {

    List<Movimiento> movimientos;

    // Constructor
    public ImplementacionRegistro(){
        this.movimientos = new ArrayList<>();
    }

    // Methodo 1
    public void getMovimientos(){
        for (Movimiento movimientos : movimientos) {
            System.out.println(movimientos.getNombre());
        }
    }

    @Override
    public void addIngreso(String nombre, String moneda, String categoria, int montoStr, String periodicidad) {

        if (!moneda.equals("USD")){
            System.out.println("Moneda No validad");
        } else {
            int monto = Integer.parseInt(String.valueOf(montoStr));
            this.movimientos.add(new Ingreso(nombre,
                    moneda,
                    categoria,
                    monto,
                    periodicidad));
        }
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);
        this.movimientos.add(new Gasto(nombre,
                moneda,
                categoria,
                monto));
    }

    // Methodo 3
    public void getGastos(){

        for (Movimiento movimiento : this.movimientos){
            if (movimiento instanceof Gasto){
                System.out.println(movimiento.getNombre());
            }
        }

    }
}