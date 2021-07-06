package Gabriel;

import java.util.Scanner;

public class matriz3 {

	public static void main(String[] args) {
	
		Float [][] valores = new Float [3][3];
		int linha,coluna=0,contmaior=0;
		

		Scanner leia = new Scanner(System.in);
		
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com o valor: ");
				valores[linha][coluna] =leia.nextFloat();
				
				if(valores[linha][coluna] >10)
				{
					
					contmaior++;
			}
		}
		
		}
		System.out.println("\nA contagem dos numeros maior que 10 é: "+contmaior);

	}

}
