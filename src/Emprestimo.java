
public class Emprestimo {
	public final static int Emprestado=1;
	public final static int Devolvido=2;
   	
	Aluno aluno;
	ItemAcervo itemAcervo;
	String dataEmprestimo;
	String dataDevolucao;
	int status;
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ItemAcervo getItemAcervo() {
		return itemAcervo;
	}

	public void setItemAcervo(ItemAcervo itemAcervo) {
		this.itemAcervo = itemAcervo;
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

	public static int getEmprestado() {
		return Emprestado;
	}

	public static int getDevolvido() {
		return Devolvido;
	}

	@Override
	public String toString() {
		return "Emprestimo [aluno=" + aluno + "\n-Emprestou--> itemAcervo=" + itemAcervo + ", dataEmprestimo=" + dataEmprestimo
				+ ", dataDevolucao=" + dataDevolucao + ", status=" + status + "]";
	}
	
}

