package com.ucreativa.oop.presupuesto.entidades;



    public class Ingreso extends Movimiento {


        private String periodicidad;

        public Ingreso(String nombre,
                       String moneda,
                       String categoria,
                       int monto,
                       String periodicidad){
            super(nombre, moneda, categoria, monto);
            this.periodicidad = periodicidad;
        }

        public Ingreso() {
            super();
        }

        @Override
        public String getDetails() {
            return "INGRESO: " + this.getNombre() + " - " +
                    this.getMoneda() + " - " +
                    this.getCategoria() + " - " +
                    this.getMonto() + " - " +
                    this.periodicidad;
        }

        @Override
        protected String getMoneda() {
            return null;
        }

        @Override
        protected String getCategoria() {
            return null;
        }


    }
