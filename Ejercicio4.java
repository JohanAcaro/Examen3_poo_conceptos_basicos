package com.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double nota = 0, suma = 0;
        n=4;
        System.out.println("Nota final");
        System.out.println("--------------------------------------");
       
        for (int i = 1; i <= n; i++) {           
            System.out.print("Nota "+ i + " del alumno" + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; 
        }   
        if (nota>=4) {
        	System.out.printf("Nota media: %.2f %n" , suma/n);
        } else if (nota<4)
        	System.out.println("Asignatura suspensa");
        
    }
}
