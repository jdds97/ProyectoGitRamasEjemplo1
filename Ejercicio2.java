package Boletin6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	final static double PI = Math.PI;
	/**
	 * En este método puedes calcular la longitud, el area y el volumen de una 
	 * esfera a partir del radio que especifique
	 * @param radioEsfera
	 * @return datoLongitud
	 */

	public static void main(String[] args) {
		int radioEsfera;
		String longitud;
		String respuesta;
		radioEsfera = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio de la esfera en cm"));
		respuesta=JOptionPane.showInputDialog("Elige lo que quieres calcular\n" + "1.Longitud\n" + "2.Area\n" + "3.Volumen")
				.toLowerCase();
		do {
			JOptionPane.showMessageDialog(null, "La longitud de la esfera es de " + longitud(radioEsfera) + " cm");
		}
		while(respuesta.equals("1")&& respuesta.equals("longitud"));
		do{
			JOptionPane.showMessageDialog(null, "El area de la esfera es de " + area(radioEsfera) + " cm cuadrados");
		}while(respuesta.equals("2")&& respuesta.equals("area"));
		do {
			JOptionPane.showMessageDialog(null, "El volumen de la esfera es de " + volumen(radioEsfera) + " cm cúbicos");
		}while(respuesta.equals("3")&& respuesta.equals("volumen"));

		
	}

	/**
	 * Este método calcula la longitud de la esfera
	 * 
	 * @param radioEsfera
	 * @return datoLongitud
	 */
	static double longitud(double radioEsfera) {
		double datoLongitud;
		datoLongitud = radioEsfera * (2 * PI);
		return datoLongitud;
	}

	/**
	 * Este método calcula el area de la esfera
	 * 
	 * @param radioEsfera
	 * @return datoArea
	 */
	static double area(double radioEsfera) {
		double datoArea;
		datoArea = 4 * PI * Math.pow(radioEsfera, 2);
		return datoArea;
	}

	/**
	 * Este método calcula el volumen de la esfera
	 * 
	 * @param radioEsfera
	 * @return datoVolumen
	 */
	static double volumen(double radioEsfera) {
		double datoVolumen;
		datoVolumen = 4 / 3 * PI * Math.pow(radioEsfera, 3);
		return datoVolumen;
	}
}