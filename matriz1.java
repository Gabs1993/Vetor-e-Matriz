package Gabriel;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numero = new int [6];
		int somapares=0,somaimpares=0,x,impar=0;
		
	
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEnte com o numero");// 5,8
			numero[x] = leia.nextInt();//numero [5],[8]
			
		if(numero[x] % 2 == 0)//falso
		{
			System.out.println("\nEsse numero é par: "+numero[x]);//5
			somapares = somapares + numero[x];
		}
		else//numero [5] 
		{
			System.out.println("\nEsse numero é impar: "+numero[x]);
			impar++;
		}
		
		
		}
		
		System.out.println("\nA soma dos pares são: "+somapares);
		System.out.println("\nOs impares digitados são "+impar);
		
	}
}
