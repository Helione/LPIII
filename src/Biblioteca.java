import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Livro> livros = new ArrayList<Livro>();
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		
	public void cadastrarAluno() {	
		Scanner e = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		
		Aluno a = new Aluno();
		System.out.print("\rInfome a matrícula do aluno: ");
		a.setMatricula(e.next());

		System.out.print("\rInfome o nome do aluno: ");
		a.setNome(n.nextLine());
		alunos.add(a);
		
		System.out.println("Aluno Cadastrado");
	}
	
	public void cadastrarLivro() {
		Scanner e = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		
		Livro l = new Livro();
		System.out.println("Informe dados para o Livro -->");
		
		System.out.print("\rTítulo: ");
		l.setTitulo(n.nextLine());
		
		System.out.print("\rAutor: ");
		l.setAutor(n.nextLine());
		
		System.out.print("\rISBN: ");
		l.setISBN(e.next());
		
		System.out.print("\rEditora: ");
		l.setEditora(e.next());
		
		livros.add(l);
		System.out.println("Livro Cadastrado");
		
	}
	
	public void listarAlunos() {
		System.out.println("**Alunos Cadastrados**");
		for(int i=0;i<alunos.size();i++)
			System.out.println((i+1) + ". " + alunos.get(i).toString());
	}
	
	public void listarLivros() {
		System.out.println("**Livros Cadastrados**");
		for(int i=0;i<livros.size();i++)
			System.out.println((i+1) + ". " + livros.get(i).toString());
	}
	
	public void emprestarLivro() {
		System.out.println("\nExibindo.....\n\n");
		listarAlunos();
		System.out.println("*******************");
		listarLivros();
		
		
		System.out.println("******************");
		System.out.println("**Empréstimo de Livros para Alunos**");
		System.out.println("Informe o id do aluno e depois o id do livro para realizar o emprestimo.\n");
		
		Emprestimo emp = new Emprestimo();
		Scanner e = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe o id do Aluno: ");
		emp.setAluno(alunos.get(e.nextInt() - 1));

		System.out.print("Informe o id do Livro: ");
		emp.setLivro(livros.get(e.nextInt() - 1));
		
		System.out.print("Informe Data de Emprestimo: ");
		emp.setDataEmprestimo(n.next());
		
		emp.setStatus(1);
		
		emprestimos.add(emp);
		
		System.out.println("\nEmprestimo Realizado!! Cuide desse Livro\n");
		
	}
	
	public void listarEmprestimos() {
		System.out.println("**Empréstimos Realizados**");
		for(int i=0;i<emprestimos.size();i++)
			System.out.println((i+1) + ". " + emprestimos.get(i).toString());
	}
	
	public void devolverLivro() {
		System.out.print("\nExibindo...\n");
		listarEmprestimos();
		
		System.out.println("************************");
		System.out.println("**Devolução de Livros**");
		
		System.out.print("Informe qual deseja devolver: ");
		Scanner e = new Scanner(System.in);
		Emprestimo emp = emprestimos.get(e.nextInt() - 1);
		
		System.out.print("Informe a data de Devolução: ");
		Scanner n = new Scanner(System.in);
		emp.setDataDevolucao(n.next());
		
		System.out.println("\nDevolução realizada! Agradecemos a Preferência\n");
		
	}
	

}
