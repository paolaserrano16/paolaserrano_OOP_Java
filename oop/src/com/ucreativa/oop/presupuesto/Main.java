package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.repo.InMemoryRepository;
import com.ucreativa.oop.presupuesto.ui.FrontEnd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Registro de Movimientos");
        FrontEnd fe = new FrontEnd("Sistema Registro de Movimientos");
        fe.build();
    }
}