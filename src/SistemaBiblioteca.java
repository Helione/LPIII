import java.util.Scanner;

public class SistemaBiblioteca {
	
	public static void main(String[] args){
	
		Scanner h= new Scanner(System.in);
		Biblioteca b= new Biblioteca();
	
		
		while(true){
			System.out.println("*************************************\n");
			System.out.println("Sistema de Biblioteca Escolar");
			System.out.print("\n(1)-Cadastrar Aluno \n(2)-Listar Aluno\n(3)-Cadastrar Livro\n(4)-Cadastrar Revista\n(5)-Cadastrar CD\n(6)-Cadastrar DVD\n(7)-Cadastrar Artigo\n(8)-Listar Acervo\n(9)-Emprestar Acervo\n(10)-Listar Empréstimos\n(11)-Devolver Acervo\n");
			System.out.print("\nEscolha uma opção:");
		
			int op=h.nextInt();
						
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
						b.cadastrarRevista();
						break;
									
				case 5:
						b.cadastrarCd();
						break;
				case 6:
						b.cadastrarDvd();
						break;
				case 7:
						b.cadastrarArtigo();
						break;
				case 8:
						b.listarItensAcervo();
						break;
						
				case 9:
						b.emprestarItens();
						break;
				
				
				case 10:
						b.listarEmprestimos();
						break;
				
				case 11:
						b.devolverAcervo();
						break;
			
				default:
					System.out.println("Opção Inválida");
					break;
			}
					 
		}
	}
		 
}
	



