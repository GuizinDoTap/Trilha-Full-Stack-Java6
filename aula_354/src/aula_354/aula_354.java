package aula_354;

import java.util.Scanner;

public class aula_354 {

	public static void main(String[] args) {
		int n1, n2, n3, resultado, resultado3, multi, sub;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n1 = leitura.nextInt();
		System.out.println("Digite mais um numero: ");
		n2 = leitura.nextInt();
		System.out.println("Digite mais um numero: ");
		n3 = leitura.nextInt();
		
		resultado = n1 + n2;
		resultado3 = n1 + n2 + n3;
		multi = n1 * n2;
		sub = n1 - n2;
		
		System.out.println("O resultado da soma entre os dois primeiros números é = " + resultado);
		System.out.println("O resultado da soma entre os três números é = " + resultado);
		System.out.println("O resultado da multiplicação entre os dois primeiros números é = " + multi);
		System.out.println("O resultado da subtração entre os dois primeiros números é = " + sub);
		
		
		resultado++;
		System.out.println("O incremento do resultado é = " + resultado);
		
		resultado--;
		System.out.println("O decremento do resultado é = " + resultado);
		
		
	}

}
