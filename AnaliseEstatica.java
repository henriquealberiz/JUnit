/**
 * 
 */

/**
 * @author 36127512021.2
 *
 */
import java.util.Scanner; // biblioteca que faz o java ler as informações do teclado
public class AnaliseEstatica {

	
	public static void main(String[] args) {
		// criando objeto scanner
		Scanner ler = new Scanner(System.in);
		int a,b;
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		//3.Lendo a primeira entrada do teclado
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		//3.Lendo a primeira entrada do teclado
		System.out.println("\nResultado dos cálculos:  \n"); //sysout + ctrl + espaço
		System.out.printf("%d + %d = %d\n", a, b, (a+b)); // \n -> pula a linha
		System.out.printf("%d - %d = %d\n", a, b, (a-b));
		System.out.printf("%d * %d = %d\n", a, b, (a*b));
		System.out.printf("%d / %d = %d\n", a, b, (a/b));
		System.out.printf("%d / %d = %4.2f\n", a, b,((double)a/b));


	}

}
