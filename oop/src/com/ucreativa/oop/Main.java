package com.ucreativa.oop;

//Un proyecto de Java con IntelliJ
//Crear variables de prueba de diferentes tipos (String, int, float, Boolean, Integer)
//Crear condicionales de prueba (If y switch)
//Crear loops de prueba (While y For)
//Crear Arreglos de prueba
//Crear un método estático de prueba.


public class Main {

    // Método Estático
    static String metodo(String var){
        var = var + "Prueba A";
        return var;
    }


    public static void main(String[] args) {
        String var;
        var = "Prueba B";
        var = "Prueba C";
        var = metodo(var);
        System.out.println(var);


        // Variables
        String nombre = "Paola";
        int edad = 24;
        float peso = 55.6f;
        Boolean estudiante = true;
        Integer edad2 = 24;


        // IF
        if (edad == 2){
            System.out.println("No es igual");
        }else if (edad == 24) {
            System.out.println("Si es igual");
        } else {
            System.out.println("OK");
        }

        //SWITCH
        switch (edad){
            case 24:
                System.out.println("Si es 24");
                System.out.println("Se confirma nuevamente que es 24");
                break;
            default:
                System.out.println("Default");
        }

        // LOOPS
        int i = 0;

            // While
        while (i < 10){
            System.out.println("Por aqui voy: " + i);
            i = i + 1;
        }

            // For
        for (int x = 0; x < 10; x++) {
            System.out.println("Por aqui va el otro: " + x);
        }

        // Array
        String[] galletas = {"Una Galleta", "Dos Galletas"};
        System.out.println("Que contiene el 0: " + galletas[0]);

    }
}