package ejerciciosOperadores;

import java.util.Scanner;

public class ejerciciosOperadores {
	private static final int PAR=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		int a;
		System.out.println("Ingresse un numero entero: ");
		a=read.nextInt();
		
		//System.out.println(a==b || a>b);
		
		if(a%PAR==0) {
			System.out.println("El numero " + a + " es par");
		}else {
			System.out.println("El numero " + a + " es impar");
		}
		
		read.close();

	}

}