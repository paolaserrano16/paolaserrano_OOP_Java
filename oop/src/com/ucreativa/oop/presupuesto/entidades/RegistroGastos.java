package com.ucreativa.oop.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroGastos {


   // public ArrayList<Object> gastos;
     List<Gasto> gastos;

    public RegistroGastos(){
        this.gastos = new ArrayList<>();

    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void addGastos(Gasto item){
        this.gastos.add(item);
    }
}