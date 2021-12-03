package com.pires;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float valorIVA; // A pesar de que IVA en España sea un número entero, utilizo float para reutilizar la función para cálculos de otros porcentajes.
        double precio;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Introduce el valor del IVA en %: ");
            valorIVA = sc.nextFloat();
            if (valorIVA<0)
            {
                System.out.println("El valor del IVA debe ser positivo");
            }
        }while (valorIVA<0);

        do
        {
            System.out.println("Introduce el precio del producto:");
            precio = sc.nextDouble();
            if (precio<0)
            {
                System.out.println("El precio debe tener un valor positivo.");
            }
        }while (precio<0);

        System.out.println("El precio total es: "+ calcularIVA(precio,valorIVA));
    }

    static double calcularIVA(double precio, float iva) //Dado un precio y un iva devuelve el precio+IVA
    {
        double precioConIVA;
        precioConIVA= precio + ((precio*iva)/100);
        return precioConIVA;
    }
}

