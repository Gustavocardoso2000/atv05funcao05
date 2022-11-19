/*Faça um programa com uma função chamada soma Imposto. A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas..*/
import java.util.Scanner;

class App {
	
	public double sumTax (double tximposto, double custo) {
		return custo + (custo * tximposto/100);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		App e = new App();
		
		System.out.println("Digite o custo: ");
		double custo = scan.nextDouble();
		
		System.out.println("Digite a alíquota do imposto: ");
		double tximposto = scan.nextDouble();
		
		System.out.println(e.sumTax(tximposto, custo));
	}
}