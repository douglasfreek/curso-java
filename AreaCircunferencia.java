package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		/*
		 * definindo variavel em java:
		 * 		- definimos o tipo da variavel;
		 * 		- definimos o nome da variavel;
		 * 		- definimos o valor da variavel.
		 */
		double raio = 3.4; // double significa que a variavel é do tipo float
		final double PI = 3.14159;  // o final antes do double significa que o valor de pi é uma constante
		double area = PI * raio * raio; // por convencao utilizamos CAIXA ALTA para constantes (final)
		System.out.println("Área = " + area + " m².");
		raio = 10; // para alterar o valor da variavel nao precisamos definir seu tipo novamente
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m²."); // concatenando a string + o valor da area
	}
}
