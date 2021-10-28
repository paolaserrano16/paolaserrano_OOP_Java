package com.ucreativa.oop.presupuesto.repo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements InterfaceRepository{

    List<String> movimientos;

    public InMemoryRepository(){
        movimientos = new ArrayList<>();
    }

    @Override
    public boolean save(String text) {
        movimientos.add(text);
        return true;
    }

    @Override
    public void read() {

        try {
            throw new IOException();
        } catch (IOException | NullPointerException ex) {
            ex.printStackTrace();
        }

        for (String item : this.movimientos){
            System.out.println(item);
        }
    }
}