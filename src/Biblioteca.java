import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<ItemAcervo> itensAcervo = new ArrayList<ItemAcervo>();
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		
	public void cadastrarAluno() {	
		Scanner e = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		
		Aluno a = new Aluno();
		System.out.println("--Informe dados para o Aluno --");
		System.out.print("\rInfome a matrícula do aluno: ");
		a.setMatricula(e.next());

		System.out.print("\rInfome o nome do aluno: ");
		a.setNome(n.nextLine());
		alunos.add(a);
		
		System.out.println("Aluno Cadastrado!");
	}
	
	public void cadastrarLivro() {
		Scanner e = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		
		Livro l = new Livro();
		System.out.println("--Informe dados para o Livro --");
		
		System.out.print("\rTítulo: ");
		l.setTitulo(n.nextLine());
		
		System.out.print("\rAutor: ");
		l.setAutor(n.nextLine());
		
		System.out.print("\rISBN: ");
		l.setISBN(e.next());
		
		System.out.print("\rEditora: ");
		l.setEditora(e.next());
		
		itensAcervo.add(l);
		System.out.println("Livro Cadastrado!");
		
	}
	

	public void cadastrarRevista(){
		Revista revista = new Revista();
		
		Scanner numero = new Scanner(System.in);
		Scanner ano = new Scanner(System.in);
		Scanner publicacao = new Scanner(System.in);		
		Scanner nome = new Scanner(System.in);
		Scanner titulo = new Scanner(System.in);
		Scanner editora = new Scanner(System.in);
		
		System.out.println("--Informe dados para a Revista --");
		System.out.println("\rDigite um numero: ");
		revista.setNumero(numero.next());
		
		System.out.println("\rDigite um ano: ");
		revista.setAno(ano.next());
		
		System.out.println("\rDigite a publicação: ");
		revista.setPublicacao(publicacao.nextLine());
		
		System.out.println("\rDigite o nome: ");
		revista.setNome(nome.nextLine());
		
		System.out.println("\rDigite um Título: ");
		revista.setTitulo(titulo.nextLine());
		
		System.out.println("\rDigite uma editora: ");
		revista.setEditora(editora.nextLine());
		
		itensAcervo.add(revista);
		System.out.println("Revista Cadastrada!");
			
	}
	
	public void cadastrarCd(){
		Cd cd = new Cd();
		
		Scanner titulo = new Scanner(System.in);
		Scanner artista = new Scanner(System.in);
		Scanner categoria = new Scanner(System.in);
		
		System.out.println("--Informe dados para o CD --");
		System.out.println("\rDigite um Título: ");
		cd.setTitulo(titulo.nextLine());
		
		System.out.println("\rDigite um Artista: ");
		cd.setArtista(artista.nextLine());
		
		System.out.println("\rDigite uma Categoria: ");
		cd.setCategoria(categoria.nextLine());
		
		itensAcervo.add(cd);
		System.out.println("CD Cadastrado!");
	}
	
	public void cadastrarDvd(){
		Dvd dvd = new Dvd();
		
		Scanner titulo = new Scanner(System.in);
		Scanner sinopse = new Scanner(System.in);
		Scanner atores = new Scanner(System.in);
		Scanner diretor = new Scanner(System.in);
		
		System.out.println("--Informe dados para o DVD --");
		System.out.println("\rDigite um Título: ");
		dvd.setTitulo(titulo.nextLine());
		
		System.out.println("\rDigite uma Sinopse: ");
		dvd.setSinopse(sinopse.nextLine());
		
		System.out.println("\rDigite um Ator(a): ");
		dvd.setAtores(atores.nextLine());
		
		System.out.println("\rDigite um Diretor: ");
		dvd.setDiretor(diretor.nextLine());
		
		itensAcervo.add(dvd);
		System.out.println("DVD Cadastrado!");
	}
	
	public void cadastrarArtigo(){
		Artigo artigo = new Artigo();
		
		Scanner titulo = new Scanner(System.in);
		Scanner autor = new Scanner(System.in);
		Scanner ano = new Scanner(System.in);
		Scanner periodico = new Scanner(System.in);
		
		System.out.println("Informe dados para o Artigo -->\n");
		System.out.println("\rDigite um Título: ");
		artigo.setTitulo(titulo.nextLine());
		
		System.out.println("\rDigite um Autor: ");
		artigo.setAutor(autor.nextLine());
		
		System.out.println("\rDigite um Ano: ");
		artigo.setAno(ano.next());
		
		System.out.println("\rDigite o Periódico: ");
		artigo.setPeriodico(periodico.next());
		
		itensAcervo.add(artigo);
		System.out.println("Artigo Cadastrado!");
	}
		
	
	public void listarAlunos() {
		System.out.println("**Alunos Cadastrados**");
		for(int i=0;i<alunos.size();i++)
			System.out.println((i+1) + ". " + alunos.get(i));
	}
	
	public void listarItensAcervo() {
		System.out.println("**Acervo Cadastrado**");
		for(int i=0;i<itensAcervo.size();i++)
			System.out.println((i+1) + ". " + itensAcervo.get(i));
	}
	
	public void emprestarItens() {
		System.out.println("\n");
		System.out.println("** Lista do Acervo **\n\n");
		listarAlunos();
		System.out.println("\n");
		listarItensAcervo();
		System.out.println("\n\n");
		
		System.out.println("------------------------------------");
		System.out.println("**Empréstimo de Acervo para Alunos**");
		System.out.println("\nInforme o id do aluno e do Acervo para realizar o emprestimo.\n");
		
		Emprestimo emp = new Emprestimo();
		Scanner e = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		
		System.out.print("\rInforme o id do Aluno: ");
		emp.setAluno(alunos.get(e.nextInt() - 1));

		System.out.print("\rInforme o id do Acervo: ");
		emp.setItemAcervo(itensAcervo.get(e.nextInt() - 1));
		
		System.out.print("\rInforme Data de Emprestimo: ");
		emp.setDataEmprestimo(n.next());
		
		emp.setStatus(Emprestimo.Emprestado);
		
		emprestimos.add(emp);
		System.out.println("\nEmprestimo Realizado!!\n");
		
	}
	
	public void listarEmprestimos() {
		System.out.println("**Empréstimos Realizados**");
		for(int i=0;i<emprestimos.size();i++)
			System.out.println((i+1) + "." + emprestimos.get(i));
	}
	
	public void listarEmprestados(){
		System.out.println("**Lista de Emprestados**");
		for(int i=0;i<emprestimos.size();i++){
			if(emprestimos.get(i).getStatus() == Emprestimo.Emprestado)
			System.out.println((i+1) + "." + emprestimos.get(i));
		}
	}
	
	public void devolverAcervo() {
		System.out.print("\n\n");
		listarEmprestimos();
		
		System.out.println("------------------------");
		System.out.println("**Devolução de Acervo**");
		
		System.out.print("Informe qual Acervo deseja devolver: ");
		Scanner e = new Scanner(System.in);
		Emprestimo emp = emprestimos.get(e.nextInt() - 1);
		
		System.out.print("Informe a data de Devolução: ");
		Scanner n = new Scanner(System.in);
		emp.setDataDevolucao(n.next());
		
		emp.setStatus(Emprestimo.Devolvido);
		
		System.out.println("\nDevolução realizada! Agradecemos a Preferência\n");
	
	}
}
