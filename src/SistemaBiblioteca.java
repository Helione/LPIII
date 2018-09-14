import java.util.Scanner;

public class SistemaBiblioteca {
	
	public static void main(String[] args){
	
		Scanner h= new Scanner(System.in);
		Biblioteca b= new Biblioteca();
	
		
		while(true){
			System.out.println("\nSistema de Biblioteca Escolar");
			System.out.print("\n(1)-Cadastrar \n(2)-Listar\n(3)-Emprestar\n(4)-Sair");
			System.out.print("\nEscolha uma opção:");
		
		int op=h.nextInt();
		
		if(op==4)
			 break;
		
		switch(op){
		case 1:
				
			System.out.println("*******************");
			
			if(op==3)
				break;
			
			switch(op) {
			case 1:
				b.cadastrarAluno();
				break;
			case 2:
				b.cadastrarLivro();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		
			break;
			
		
		case 2:
			
			System.out.println("*******************");
			
			 if(op==3)				 
			 	break;
			
			 switch(op) {
				case 1:
					b.listarAlunos();
					break;
				case 2:
					b.listarLivros();
					break;
				case 3:
					b.listarEmprestimos();
					break;
				default:
					System.out.println("Opção Inválida");
					break;
			  }
				
				break;
			
		case 3:
			
			System.out.println("*******************");
					
			if(op==3)
				break;
			
			switch(op){
			case 1:
				b.emprestarLivro();
				break;
			case 2:
				b.listarEmprestimos();
				break;
			case 3:
				b.devolverLivro();
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
				 
			break;
						 			 
			 
			}
			
		}
		 
	}
}

