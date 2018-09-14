import java.util.ArrayList;
import java.util.Scanner;

public class Academico {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public void cadastrarAluno(){
		Scanner  enome = new Scanner(System.in);
		Scanner ematricula = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		System.out.print("\rInforme a Matrícula: ");
		a.matricula = ematricula.next();
		
		System.out.print("\rInforme o nome: ");
		a.nome = enome.nextLine();
		alunos.add(a);
		
		System.out.println("\nAluno Cadastrado!!");
		
	}
	
	public void listarAluno(){
		
			System.out.println("Lista de Alunos\n");
						
			for(int i =0; i<alunos.size();i++)
				System.out.println("Nº"+(i+1)+". "+alunos.get(i));
		}
		
	public void removerAluno(){
		Scanner e = new Scanner(System.in);
		
		listarAluno();
		System.out.print("\nDigite o nome do Aluno que desejas remover : ");
		int i = e.nextInt();
		
		i--;
		alunos.remove(i);
		System.out.println("\n Aluno Removido!! ");
		
	}
	
	public void alterarAluno(){
		Scanner ematricula = new Scanner(System.in);
		Scanner enome = new Scanner(System.in);
		
		listarAluno();
		System.out.print("Informe o Aluno que deseja alterar: ");
		int i = enome.nextInt();
		i--;
		
		Aluno a = alunos.get(i);
		
		System.out.println(a.getMatricula() + ", modifica para :");
		a.matricula = ematricula.next();
		
		System.out.println(a.getNome() + ", modifica para :");
		a.nome = enome.nextLine();
		
		System.out.print("\nO Aluno Foi Alterado com Sucesso");
		
	}
}

