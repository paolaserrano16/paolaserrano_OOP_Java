package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {


        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;

        while (siga){

        System.out.println("Digite el nombre de su Movimiento:");
        consola.nextLine();

        System.out.println("Digite la Moneda");
        String moneda = consola.nextLine();

        System.out.println("Digite la categoria de su Movimiento");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto de su Movimiento:");
        String montoStr = consola.nextLine();
        int monto = Integer.parseInt(montoStr);

        Movimiento nuevoMovimiento;


        System.out.println("Indique si es un Gasto (¨S¨)");
            if (consola.nextLine().equals("s")){
                nuevoMovimiento = new Gasto(
                        moneda,
                        categoria,
                        monto);

           } else {
                System.out.println("Especifique la Periodicidad: ");
                String periodicidad = consola.nextLine();

             nuevoMovimiento = new Ingreso(
                        moneda,
                        categoria,
                        monto,
                        periodicidad);
            }



        System.out.println("Quiere seguir?(¨s¨)");
        siga = consola.nextLine().equals("s");

        }
    }
}


