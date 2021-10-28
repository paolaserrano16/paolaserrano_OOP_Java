package com.ucreativa.oop.presupuesto.repo;

public interface InterfaceRepository {

   // boolean save (String text);
    boolean save (String text) throws ErrorMuyPocaData ;

    void read ();

}