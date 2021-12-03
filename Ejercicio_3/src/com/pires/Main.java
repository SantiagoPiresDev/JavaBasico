package com.pires;

import java.util.Scanner;

public class Main {


        public static void main(String[] args)
        {
            int numeroDeElementos;
            Scanner sc = new Scanner(System.in);

            String finalString="";
            do{
                System.out.println("Introduce el numero de cadenas a concatenar");
                numeroDeElementos=sc.nextInt();
                if (numeroDeElementos<2)
                {
                    System.out.println("Deben existir al menos dos cadenas para concatenar");
                }
            }while(numeroDeElementos<2);

            String arrayStrings[] = new String[numeroDeElementos]; //Inicializo el array con el número de elemento seleccionado

            for (int i=0; i<arrayStrings.length;i++)
            {
                System.out.println("Introduce la cadena " + (i+1) + " de " + arrayStrings.length + ":");
                arrayStrings[i]=sc.next();
                finalString += arrayStrings[i];
            }
            System.out.println("La cadena concatenada sin espacios es: " + finalString);
            finalString="";

            for (int i=0; i<arrayStrings.length;i++)
            {
                           finalString += arrayStrings[i] + " ";
            }

            System.out.println("La cadena concatenada con espacios es: " + finalString);
        }

}
