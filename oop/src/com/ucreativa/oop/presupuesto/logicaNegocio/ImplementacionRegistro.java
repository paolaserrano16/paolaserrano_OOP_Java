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

    @Override
    public boolean addIngreso(String s, String nombre, String moneda, String categoria, String periodicidad) {
        return false;
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {
        return false;
    }

    // Methodo 1
    public void getMovimientos(){
        for (Movimiento movimientos : movimientos) {
            System.out.println(movimientos.getNombre());
        }
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