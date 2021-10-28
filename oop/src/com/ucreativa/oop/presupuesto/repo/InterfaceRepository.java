package com.ucreativa.oop.presupuesto.repo;

import java.util.List;

public interface InterfaceRepository {

    boolean save (String text) throws ErrorMuyPocaData;

  //  void read ();
    List<String> read ();

}