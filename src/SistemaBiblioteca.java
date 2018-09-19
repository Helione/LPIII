import java.util.Scanner;

public class SistemaBiblioteca {
	
	public static void main(String[] args){
	
		Scanner h= new Scanner(System.in);
		Biblioteca b= new Biblioteca();
	
		
		while(true){
			System.out.println("*************************************\n");
			System.out.println("Sistema de Biblioteca Escolar");
			System.out.print("\n(1)-Cadastrar Aluno \n(2)-Listar Aluno\n(3)-Cadastrar Livro\n(4)-Listar Livro\n(5)-Emprestar Livros\n(6)-Listar Empréstimos\n(7)-Devolver Livro\n");
			System.out.print("\nEscolha uma opção:");
		
		int op=h.nextInt();
		
		if(op==4)
			 break;
		
		switch(op){
					
		case 1:
				b.cadastrarAluno();
				break;
		case 2:
				b.listarAlunos();
				break;
			
							
		case 3:
				b.cadastrarLivro();
					break;
		case 4:
				b.listarLivros();
					break;
							
		case 5:
				b.emprestarLivro();
				break;
		case 6:
				b.listarEmprestimos();
				break;
		case 7:
				b.devolverLivro();
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
					 
		}
	}
		 
}
	



