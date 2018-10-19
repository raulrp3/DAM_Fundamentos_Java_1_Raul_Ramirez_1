package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion){
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case  0:{
                while(!sc.hasNextInt()){
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1:{
                while(!sc.hasNextDouble()){
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return  validado;
    }
    public static double calcularRaiz(double a,double b,double c){
        double resultado;
        resultado = Math.sqrt(Math.pow(b,2) - 4 * a * c);
        return resultado;
    }
    public static void main(String[] args) {
        double a = 0,b = 0,c = 0,parteRaiz,primeraSolucion,segundaSolucion;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!,vamos a realizar una ecuación de segundo grado.");
        System.out.print("Coeficiente A: ");
        a = validador(1);
        System.out.print("Coeficiente B: ");
        b = validador(1);
        System.out.print("Coeficiente C: ");
        c = validador(1);
        sc.close();
        parteRaiz = calcularRaiz(a,b,c);
        if (parteRaiz <= 0){
            System.out.println("La ecuación no tiene soluciones reales.");
        }else{
            primeraSolucion = (- b + parteRaiz) / (2 * a);
            segundaSolucion = (- b -parteRaiz) / (2* a);
            System.out.printf("El resultado de la primera solución es %f\n", primeraSolucion);
            System.out.printf("y el resultado de la segunda ecuación es %f\n", segundaSolucion);
        }
    }
}
