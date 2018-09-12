
public class Emprestimo {
   	
	Aluno aluno;
	Livro livro;
	String dataEmprestimo;
	String dataDevolucao;
	int status;
	
	
	public Aluno getAluno() {  // retorna o valor da variavel Aluno
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;       //referencia o pr�prio objeto
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {  //setLivro(Livro livro) = altera o valor da variavel Livro pelo que foi passado pelo parametro
		this.livro = livro;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {  //Tem que ser void, pois n�o retorna um valor
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Emprestimo\n Aluno: " + aluno.getMatricula() + "-" + aluno.getNome()
		+ ",\n Livro: " + livro.getISBN() +"-" + livro.getTitulo()
		+ ",\n Data de Emprestimo: " + dataEmprestimo
		+ ",\n Data de Devolu��o: " + dataDevolucao 
		+ ",\n Status=" + status + "\n";
	}
	
}

