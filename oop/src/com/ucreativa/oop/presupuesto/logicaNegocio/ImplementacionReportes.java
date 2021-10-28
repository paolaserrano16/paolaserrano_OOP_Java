package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

import java.util.stream.Collectors;

public class ImplementacionReportes implements InterfaceReportes{

    private InterfaceRepository repository;

    public ImplementacionReportes(InterfaceRepository repository){

        this.repository = repository;
    }

    @Override
    public void imprimirReporte() {

    }

    @Override
    public void getMovimientos() {
        Movimiento m = new Movimiento("nombre",
                "USD",
                "Cat",
                2) {
            @Override
            public String getDetails() {
                return "";
            }
        };

  //     return this.repository.read().stream().map(item -> item + "\n")
  //              .collect(Collectors.toList());
    }

    @Override
    public void getGastos() {
        this.repository.read();
    }
}