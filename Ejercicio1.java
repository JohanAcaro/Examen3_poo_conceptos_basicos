package com.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		String sCadenaInvertida;
		sCadenaInvertida="";

		String sCadena = "Texto al revés";
		for (int x=sCadena.length()-1;x>=0;x--)
			  sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
		System.out.println(sCadenaInvertida);
	}
}
