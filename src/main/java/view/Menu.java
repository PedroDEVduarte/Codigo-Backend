package view;
import java.util.Scanner;
public class Menu {

	Scanner teclado = new Scanner(System.in);
	
	public void apresentarMenu() {
		int opcao = this.apresentarOpcoesMenu();
		while(opcao !=4) {
			switch(opcao) {
			case 1: {
				System.out.println("entrei no menu de cliente");
				break;
			}
			case 2: {
				System.out.println("entrei no menu de veículo");
				break;
			}
			case 3: {
				System.out.println("entrei no menu de venda");
				break;
			}
			default:
				System.out.println("\nOpção invalida!");	
		}
	}
		opcao = this.apresentarOpcoesMenu();
	}
}
