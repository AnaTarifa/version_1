/**
 * 
 */
package Regristro;

import java.util.Scanner;

/**
 * @author cris9
 *
 */
public class Constancia_Alumno_Regular {


	/**
	 * @param args
	 */
	public static  void main (String [] args) {

       
        String nombre;
		String carrera;
		int numeroLibreta;

		Scanner scr = new Scanner(System.in);
		 String Inpt = sc.next();
	        System.out.println(Inpt);
			
		System.out.print("Nombre: ");
		nombre = scr.nextString();
		System.out.println(" ");
		System.out.print("Carrera: ");
		carrera = scr.nextString();
		System.out.println(" ");
		System.out.print("Número de libreta: ");
		numeroLibreta = scr.nextInt();
		

}

}
