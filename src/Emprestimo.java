
public class Emprestimo {
   	
	Aluno aluno;
	Livro livro;
	String dataEmprestimo;
	String dataDevolucao;
	int status;
	
	

	
	public Aluno getAluno() {
		return aluno;
	}




	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}




	public Livro getLivro() {
		return livro;
	}




	public void setLivro(Livro livro) {
		this.livro = livro;
	}




	public String getDataEmprestimo() {
		return dataEmprestimo;
	}




	public void setDataEmprestimo(String dataEmprestimo) {
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
		+ ",\n Data de Devolução: " + dataDevolucao 
		+ ",\n Status=" + status + "\n";
	}
	
}

