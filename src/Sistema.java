import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner b = new Scanner(System.in);
		
		Academico academico = new Academico();
		
		while(true){
			for(int h = 0; h<3; h++)
				System.out.println("");
			
			System.out.println("** MENU **");
			System.out.print("(1)-Cadastrar"
					+ "\n(2)-Listar"
					+ "\n(3)-Remover"
					+ "\n(4)-Alterar"
					+ "\n(5)-Sair"
					+ "\n\rEscolha: ");
			
			int i = b.nextInt();
			
			if(i == 5)
				break;
			
			switch(i){
			case 1:
				for(int h = 0; h<3; h++)
					academico.cadastrarAluno();
				break;
				
			case 2:
				for(int h = 0; h<1; h++)
					System.out.println("");
					academico.listarAluno();
				break;
				
			case 3:
				for(int h = 0; h<3; h++)
					academico.removerAluno();
				break;
				
			case 4:
				for(int h = 0; h<3; h++)
					academico.alterarAluno();
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
		
	}

}
