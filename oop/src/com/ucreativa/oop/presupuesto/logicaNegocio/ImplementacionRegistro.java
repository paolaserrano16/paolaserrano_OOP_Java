package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceReportes;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

import java.util.ArrayList;
import java.util.List;


    public class ImplementacionRegistro implements InterfaceRegistro, InterfaceReportes {
        private InterfaceRepository repository;

        List<Movimiento> movimientos;
        private Object String;

        public ImplementacionRegistro(InterfaceRepository repository){

            // Constructor
    //public ImplementacionRegistro() {
                this.movimientos = new ArrayList<>();
            }

        public ImplementacionRegistro() {

        }

        // Methodo 1
            public void getMovimientos() {
                for (Movimiento movimientos : movimientos) {
                    System.out.println(movimientos.getDetails());
                }
                this.repository = repository;
            }

        @Override
        public void getGastos() {

        }

        public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {

                if (!moneda.equals("USD")) {
                    System.out.println("Moneda No validad");
                } else {
                    int monto = Integer.parseInt(montoStr);
                    this.movimientos.add(new Ingreso(nombre,
                            moneda,
                            categoria,
                            monto,
                            periodicidad));

                    try {
                        monto = Integer.parseInt(montoStr);
                    }catch (NumberFormatException ex){
                        System.out.println("Formato Invalido en ("+montoStr+"): " + ex.getMessage());
                        return false;
                    }
                    return true;


                }

            return false;
        }

        @Override
        public boolean addGasto(java.lang.String nombre, java.lang.String moneda, java.lang.String categoria, java.lang.String montoStr) {
            return false;
        }
    }





