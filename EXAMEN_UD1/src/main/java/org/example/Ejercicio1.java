package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public void Ejercicio1 (){

        Scanner entrada = new Scanner(System.in);

        int nota1= 1;
        int nota2= 1;
        int nota3= 1;


        System.out.println("Introduce la nota del primer trimestre");
        nota1 = entrada.nextInt();

        System.out.println("Intorduce la nota del segundo trimestre");
        nota2 = entrada.nextInt();

        System.out.println("Introduce la nota del tercer trimestre");
        nota3 = entrada.nextInt();


        int Notafinal = ((nota1 + nota2 + nota3) / 3);
            if (Notafinal < 5) {
                System.out.println("La media obtenida es " + Notafinal + " SUSPENSO");
            }else
                System.out.println("La media obtenida es " + Notafinal + " APROBADO");
        }

    }

