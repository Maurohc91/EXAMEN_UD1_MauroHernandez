package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public void Ejercicio2() {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int aux = 0;

        while (aux == 0) {
            try {
                System.out.println("Introduce un numero");
                num1 = entrada.nextInt();
                ;
                aux = 1;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Intorduce un valor válido");
                entrada.nextLine();
            }

        }
        if (num1 < 0) {
            num2= num1 * -1;
            num1 = num2;
            System.out.println("El valor absoluto es " + num2);

        } else {

            System.out.println("El valor absoluto es " + num1);
        }
    }






        }


