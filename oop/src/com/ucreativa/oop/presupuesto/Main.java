package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.RegistroGastos;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;


        while (siga){

        System.out.println("Digite el nombre de su gasto:");
        consola.nextLine();

        System.out.println("Digite la Moneda");
        String moneda = consola.nextLine();

        System.out.println("Digite la categoria de su gasto");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto de su gasto:");
        String montoStr = consola.nextLine();
        int monto = Integer.parseInt(montoStr);


        Gasto nuevoGasto = new Gasto("luz",
                "Colones",
                "Servicios",
                22000);


        Gasto gastoInternet = new Gasto("luz",
                "Dolares",
                "Servicios",
                30);

        RegistroGastos registro = new RegistroGastos();
        registro.getGastos().add(nuevoGasto);
        registro.getGastos().add(gastoInternet);


/*
        for (int i = 0; i < registro.getGastos().size(); i++) {
            System.out.println(registro.getGastos().get(i));
        }

*/

 /*
        for (Gasto gastico: registro.getGastos()){
            System.out.println(gastico);
*/
        for (Gasto gastico: registro.getGastos()){
            String nombre = nuevoGasto.getNombre();
            System.out.println(nombre);
        }

        System.out.println("Quiere seguir?(¨s¨)");
        siga = consola.nextLine().equals("s");


        }
    }
}