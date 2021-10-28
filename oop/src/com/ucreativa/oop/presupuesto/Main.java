package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;

import java.util.Scanner;

import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;
import com.ucreativa.oop.presupuesto.ui.FrontEnd;

public class Main {



    public static void main(String[] args) throws ErrorMuyPocaData {


        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        System.out.println("Que quiere usar? Fake (F):");

        InterfaceRegistro registro;
        if (consola.nextLine().equals("F")){
            if (consola.nextLine().equals("F")) {
                registro = new ImplementacionSuperDummy();
            } else {

                registro = new ImplementacionRegistro();
            }




            while (siga){

                System.out.println("Digite el nombre de su Movimiento:");
                consola.nextLine();

                System.out.println("Digite la Moneda:");
                String moneda = consola.nextLine();
            }

            System.out.println("Digite la categoria de su Movimiento");
            String categoria = consola.nextLine();
            while (siga) {
                System.out.println("Digite el nombre de su Movimiento:");
                String nombre = consola.nextLine();

                System.out.println("Digite el monto de su Movimiento:");
                String montoStr = consola.nextLine();
                int monto = Integer.parseInt(montoStr);
                System.out.println("Digite la Moneda:");
                String moneda = consola.nextLine();

                Movimiento nuevoMovimiento;
                System.out.println("Digite la categoria de su Moviento:");
               // String categoria = consola.nextLine();

                System.out.println("Digite el monto de su Movimiento:");
               // String montoStr = consola.nextLine();

                System.out.println("Indique si es un Gasto (¨S¨)");
                if (consola.nextLine().equals("s")){
                    System.out.println("Indique si es un Gasto (S)");
                    if (consola.nextLine().equals("S")){
                        registro.addGasto(nombre,
                                moneda,
                                categoria,
                                montoStr);

                    } else {
                        System.out.println("Especifique la Periodicidad: ");

                        System.out.println("Especifique la Periodicidad:");
                        String periodicidad = consola.nextLine();


                        registro.addIngreso(nombre,
                                moneda,
                                categoria,
                                monto,
                                montoStr,
                                periodicidad);
                    }

                    System.out.println("Todos los movientos:");
                    registro.getMovimientos();

             /* nuevoMovimiento = new Ingreso(
                        moneda,
                        categoria,
                        categoria,
                        monto,
                        periodicidad);
            } */
                    System.out.println("Solo Gastos:");
                    registro.getGastos();

                    System.out.println("Quiere Seguir?(`S`)");
                    siga = consola.nextLine().equals("S");
                }


                System.out.println("Quiere seguir?(¨s¨)");
                siga = consola.nextLine().equals("s");

            }
            FrontEnd fe = new FrontEnd("Sistema Registro de Movimientos");
            fe.build();
        }
    }


}