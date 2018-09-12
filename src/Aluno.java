
public class Aluno {
	String matricula;
	String nome;

	public String getMatricula() {
		return matricula;
	}
	public void Matricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void Nome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Aluno * nome= " + nome + ", matrícula= " + matricula + "*";
	}
}
