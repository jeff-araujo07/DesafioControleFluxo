package contador;
import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Digite o 1º número: ");
			int param1 = scan.nextInt();
			System.out.print("Digite o 2º número: ");
			int param2 = scan.nextInt();
			contar(param1, param2);
		} catch(ParametrosInvalidosException e) {
			System.err.println("Erro: " + e.getMessage());
		} finally {
            scan.close();
        }
		
	}
	
	public static void contar(int param1, int param2) throws ParametrosInvalidosException{
		if(param1 > param2)
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		
		else {
			int contagem = param2 - param1;
			System.out.println("O RESULTADO FOI UM NÚMERO POSITIVO (" + param2 + " - " + param1 + " = " + contagem +")");
			System.out.println("PORTANTO, IREMOS IMPRIMIR OS " + contagem + " NÚMEROS ABAIXO:");
			for(int i=1; i <= contagem; i++)
				System.out.println("NÚMERO: " + i);
		}
		
	}
}